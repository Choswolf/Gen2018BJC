package com.algoritomopoo.misclases;

import java.util.Date;

public class MascotaNuevo {

	private String id;
	private String nombre;
	private String especie;
	private Date fechaIngreso;
	private Date fechaSalida;
	private String estado;

	public MascotaNuevo()
	{
	}


	public MascotaNuevo(String id,String nombre,String especie,Date fechaIngreso, Date fechaSalida,String estado)
	{
		this.id=id;
		this.nombre=nombre;
		this.especie=especie;
		this.fechaIngreso=fechaIngreso;
		this.fechaSalida=fechaSalida;
		this.estado=estado;
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
	public String getEspecie()
	{
		return especie;
	}
	public void setEspecie(String especie)
	{
		this.especie = especie;
	}
	public Date getFechaIngreso()
	{
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso)
	{
		this.fechaIngreso = fechaIngreso;
	}
	public Date getFechaSalida()
	{
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida)
	{
		this.fechaSalida = fechaSalida;
	}
	public String getEstado()
	{
		return estado;
	}
	public void setEstado(String estado)
	{
		this.estado = estado;
	}

}
