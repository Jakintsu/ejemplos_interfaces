package com.ejemplos.interfaces;

public class MetodosAuxiliares {

	public static int cuentaPrestados(Object[] lista) {
		int contador = 0;
		for(Object o: lista) {
			//&Se comprueba que es Prestable y se transforma a Prestable para llamar a prestado()
			if(o instanceof Prestable && ((Prestable)o).prestado()) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static int publicacionesAnteriores(Publicacion[] lista, int anyo) {
		int contador = 0;
		
		for(Publicacion p: lista) {
			//Todas las clases que hereden de Publicacion tienen el método getAnyo()
			if(p.getAnyo() < anyo) {
				contador++;
			}
		}
		
		return contador;
	}
}
