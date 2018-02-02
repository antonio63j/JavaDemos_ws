package com.antonio.articulos;

public class Camisa {
	private String color;
	private String talla;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Camisa [color=");
		builder.append(color);
		builder.append(", talla=");
		builder.append(talla);
		builder.append("]");
		return builder.toString();
	}
	public Camisa(String color, String talla) {
		super();
		this.color = color;
		this.talla = talla;
	}
	public Camisa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}

}
