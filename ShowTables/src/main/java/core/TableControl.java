package core;

import javax.sql.DataSource;
import javax.xml.bind.JAXBElement;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import tablasxjc.Tablas;
import tablasxjc.Tablas.Tabla;
import tablasxjc.Tablas.Tabla.Campo;


@Component
public class TableControl {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private Tablas tablas;
	
	Connection con = null;
	
	
	/**
	 * 
	 * @throws SQLException
	 */
	public void conectar () throws SQLException  {
    	this.con = dataSource.getConnection();
    	
    }
    
    
    /**
     * 
     * @throws SQLException
     */
      
    public void desconectar () throws SQLException{
    	if (this.con != null) {
    		con.close();
    		con = null;
    	}
    }
    
    public List<Tablas.Tabla> getTablas (){
    	List <Tablas.Tabla> ltablas;
    	ltablas = tablas.getTablas();
    	return ltablas;
    }
    
    public void showTablas(){
    	List<Tablas.Tabla> ltablas = this.getTablas();
    	for (Tabla t : ltablas){
    		System.out.println ("tabla = " + t.getName());
    		String logfile = (t.getLogfile() == null) ? t.getName() + ".log" : t.getLogfile();
    		System.out.println ("logfile = " + logfile);
    		String outfile = (t.getOutfile() == null) ? t.getName() + ".txt" : t.getOutfile();
    		System.out.println ("outfile = " + outfile);
    		List<Campo> lcampos = t.getCampo();

     		for (Campo c : lcampos){
    			
 		
	    	    for( Serializable s: c.getContent() ){
	    	    	String data="";
	    	    	String nombre="";
	    	        if( s instanceof String ){
	    	            System.out.print( (String)s );
	    	        } else if (s instanceof JAXBElement) {
	 			        //System.out.println(((JAXBElement)o).getValue().toString());
	 			        data=((JAXBElement)s).getValue().toString();
	 			        nombre =((JAXBElement) s).getName().toString();
	 			   }
	    	       System.out.println("nombre=" + nombre +", data=" + data); 
	    		}
    	
     		}
    	}	
    }
     		
    
    public void muestraCabeceras( String tabla) throws SQLException{
    	String sqlQuery = "Select * from " + tabla;
		ResultSet rs = con.createStatement().executeQuery(sqlQuery);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		System.out.printf("The query fetched %d columns\n",cols);
		System.out.println("These columns are: ");
		for (int i=1;i<=cols;i++) {
			int columnSize =  rsmd.getColumnDisplaySize(i);
			String colName = rsmd.getColumnName(i);
			String colType = rsmd.getColumnTypeName(i);
			System.out.println(colName+" of type "+colType + " size " + columnSize);
			
		}
    }
    
    
    
}
