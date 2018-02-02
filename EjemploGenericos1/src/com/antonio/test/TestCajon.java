/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.test;

import java.util.ArrayList;
import java.util.List;

import com.antonio.genericos.A;
import com.antonio.genericos.A1;
import com.antonio.genericos.Cajon;
/**
 *
 * @author Administrador
 */


public class TestCajon {

    /**
     * @param args the command line arguments
     */
    
    void test1() {
        List<? extends A> lista = new ArrayList<>();
 
                //Cajon<? extends A> cajon = new Cajon(A1);
        Cajon<A> cajon2 = new Cajon();
        cajon2.set(new A1());
        
        System.out.println(cajon2);
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    TestCajon test = new TestCajon();
    test.test1();
        
    }
    
}
