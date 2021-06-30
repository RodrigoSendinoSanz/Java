package com.itt.libreria;

/**
*
* @author Rodri
*/

public class Libro {
	private String titulo;
	private String genero;
	private Autor autor;
	
	public Libro(String titulo,String genero, Autor aut) {
		this.setTitulo(titulo);
		this.setGenero(genero);
		this.autor = aut;
		}

	@Override
	public String toString() {
		return "Libro: \n"
				+ "Titulo= " + titulo + ", Genero= " + genero + ", Autor= " + autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}