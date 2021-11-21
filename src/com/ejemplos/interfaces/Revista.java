package com.ejemplos.interfaces;

public class Revista extends Publicacion{

	
	private int numero;
	
	public Revista(String codigo, String titulo, int anyo, int numero) {
		//Llamada al constructor de la superclase
		super(codigo, titulo, anyo);
		this.numero = numero;
	}

	@Override
	public String toString() {
		//Llamada al método toString de la superclase
		return super.toString()+ " Revista [numero=" + numero + "]";
	}
	
	

}
