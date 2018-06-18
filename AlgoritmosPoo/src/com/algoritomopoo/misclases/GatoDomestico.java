package com.algoritomopoo.misclases;

public class GatoDomestico extends Felino
{
	private String nombreDuenio;
	
	public GatoDomestico()
	{
	}
	
	public GatoDomestico(String nombreDuenio)
	{
		this.nombreDuenio=nombreDuenio;
	}
	
	public String getNombreDuenio()
	{
		return nombreDuenio;
	}
	
	public void setNombreDuenio(String nombreDuenio)
	{
		this.nombreDuenio=nombreDuenio;
	}
	

}
