package com.ejemplos.interfaces;

public class Proyecto extends Publicacion implements Prestable, Comparable<Proyecto> {

	private Carrera carrera;
	private boolean prestado;

	public Proyecto(String codigo, String titulo, int anyo, Carrera carrera) {
		super(codigo, titulo, anyo);
		this.carrera = carrera;
	}

	@Override
	public int compareTo(Proyecto o) {
		//La comparación entre proyectos se hace por código
		return getCodigo().compareTo(o.getCodigo());
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
	
	

}
