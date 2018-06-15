package com.algoritmosbasicos.main;
import java.util.Scanner;

//imprime tu nombre 50 veces	
public class AppMostrarNombres 
{
	
	public static void main(String[] args) 
	{
		String sNombre = " ";
	
		int cont=0;
		Scanner leer = new Scanner(System.in);
		/*
	
	 	//Ciclo for
		System.out.println("Dame tu nombre");
		sNombre = read.nextLine();

		
		for(int cont=0; cont<50;cont++)
		{
			System.out.println("Soy "+ sNombre);
			}
	 	*/
		/*
		//Ciclo while
		System.out.println("Dame tu nombre");
		sNombre = read.nextLine();

		
		while(cont<10)
		{
			cont++;
			System.out.println("Soy "+ sNombre);
		}
		*/
		
		//Ciclo while
		System.out.println("Dame tu nombre");
		sNombre = leer.nextLine();

		
		do
		{
			cont++;
			System.out.println("Soy "+ sNombre);
		}
		while(cont<10);
		leer.close();
	}
}


