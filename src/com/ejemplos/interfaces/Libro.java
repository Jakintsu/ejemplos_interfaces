package com.ejemplos.interfaces;

public class Libro extends Publicacion implements Prestable {

	

	private boolean prestado;
	
	public Libro(String codigo, String titulo, int anyo) {
		super(codigo, titulo, anyo);
		prestado = false;
	}
	@Override
	public void prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public boolean prestado() {
		return prestado;
	}
	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + ", Codigo=" + getCodigo() + ", Titulo=" + getTitulo()
				+ ", Año=" + getAnyo() + "]";
	}
	
	

}
