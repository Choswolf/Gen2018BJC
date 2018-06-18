package com.algoritomopoo.misclases;


public class Canino extends MascotaNuevo
{
	private String raza;
	
	public Canino()
	{
	}
	
	public Canino(String raza)
	{
		this.raza=raza;
	}
	
	public String getRaza()
	{
		return raza;
	}
	public void setRaza(String raza)
	{
		this.raza= raza;
	}

}
