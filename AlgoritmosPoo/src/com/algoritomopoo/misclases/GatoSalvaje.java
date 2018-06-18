package com.algoritomopoo.misclases;

public class GatoSalvaje extends Felino
{
	private String habitad;
	private String procedencia;
	
	public GatoSalvaje()
	{
	}
	
	public GatoSalvaje(String habitad, String procedencia)
	{
		this.habitad=habitad;
		this.procedencia=procedencia;
	}
	
	public String getHabitad()
	{
		return habitad;
	}
	
	public void setHabitad(String habitad)
	{
		this.habitad=habitad;
	}
	public String getProcedencia()
	{
		return procedencia;
	}
	
	public void setProcedencia(String procedencia)
	{
		this.procedencia=procedencia;
	}
}
