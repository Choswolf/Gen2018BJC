package com.algoritomopoo.misclases;

public class Mascota
{
	private String id;
	private String nombre;
	private String raza;
	private String descripcion;

	public Mascota()
	{
	}


	public Mascota(String id,String nombre,String raza,String descripcion)
	{
		this.id=id;
		this.nombre=nombre;
		this.raza=raza;
		this.descripcion=descripcion;
	}	
	public String getID()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getRaza()
	{
		return raza;
	}
	public void setRaza(String raza)
	{
		this.raza = raza;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	
}