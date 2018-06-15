package com.algoritmosbasicos.main;

import java.util.Scanner;

public class triangulodepascal
{

	public static void main(String args[]) 
	{
	int iNumero=0, iContador=0;
	long iResultado=0;
	Scanner leer = new Scanner(System.in);
	System.out.println("Triangulo de pascal \n hasta que fila quieres imprimir \n");
	iNumero= leer.nextInt();
	for(int iFila=0;iFila<=iNumero;iFila++) 
	{
		for (iContador=((iNumero-iFila));iContador >= 0;iContador--)
			System.out.print("\t");
		for (int iPosicion=0 ; iPosicion <= iFila;iPosicion++)
			{
			iResultado= factorial(iFila)/(factorial(iPosicion)*factorial(iFila-iPosicion)); 
			System.out.print(iResultado+"\t\t");
			}
		System.out.print(" \n");
		leer.close();
	
	}
		
	
	}
	
	public static int factorial(int iFactorial)
	{
		int iResultado = 1;
		//iResultado: Se elige en 1 para poder hacer la multiplicacion del algoritmo 0*x=0
	
		for(int iContador = 1 ;iContador <= iFactorial;iContador++)
			//iContador: Se posiciona en la primera ubicacion.	
			iResultado = iResultado * iContador;
		return(iResultado);
	}
}