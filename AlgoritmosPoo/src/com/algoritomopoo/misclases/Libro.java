package com.algoritomopoo.misclases;

public class Libro 
{
	// Declaración de las propiedades de la Clase
	public String ISBN;
	public String Titulo;
	public String Autor;
	public int iAnio;
	public int noHojas;
	public double precio;
	public boolean isPastaDura;
	
	// Constructor vacío
	// Inicializar parámetros default
	public Libro()
	{
		this.ISBN = "101-B";
		this.Titulo = "NoName";
		this.Autor = "Indefinido";
		this.iAnio = 0;
		this.noHojas = 0;
		this.precio = 0.0;
		this.isPastaDura = false;
	}
	
	
	public Libro(String ISBN)
	{
		this.ISBN = ISBN;
	}
	
	public Libro(String ISBN, String Titulo)
	{
		this.ISBN = ISBN;
		this.Titulo = Titulo;
	}
	
	public Libro(String ISBN, String Titulo, String Autor)
	{
		this.ISBN = ISBN;
		this.Titulo = Titulo;
		this.Autor = Autor;
	}
	
	public Libro(String ISBN, String Titulo, String Autor, int iAnio)
	{
		this.ISBN = ISBN;
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.iAnio = iAnio;
	}
	
	public boolean prestarLibro()
	{
		return false;
	}
	
	public void agregarLibro()
	{
		
	}
	
	public boolean eliminarLibro()
	{
		return false;
	}
	
	public int contarLibros()
	{
		return 0;
	}
	
	public double verPrecio(String ISBN) 
	{
		return precio;
	}
}