package com.algoritmosbasicos.main;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		int iResultado=0 ,iFactorial=0, iContador=0;
		System.out.println("Te imprimire el factorial de un numero");
		System.out.println("Que numero quieres");
		iFactorial= leer.nextInt();
		iResultado = 1 ;//Se elige en uno para poder hacer la multiplicacion del algoritmo
		iContador = 1 ;// Se posiciona en la primera ubicacion.
		//while
		/*
		while (iContador <= iFactorial)
		{
			System.out.print(iContador);
			if(iContador < iFactorial)
				System.out.print(" * ");
			iResultado = iResultado * iContador;
			iContador++ ;
		}
		System.out.print(" = " + iResultado);
		*/
		//do...while
		/*
		do
		{
			System.out.print(iContador);
			if(iContador < iFactorial)
				System.out.print(" * ");
			iResultado = iResultado * iContador;
			iContador++ ;
		}
		while (iContador <= iFactorial);
		System.out.print(" = " + iResultado);
		*/
		//for
		
		for(iContador = 1, iResultado = 1 ;iContador <= iFactorial;iContador++)
		{
			System.out.print(iContador);
			if(iContador < iFactorial)
				System.out.print(" * ");
			iResultado = iResultado * iContador;	
		}
		System.out.print(" = " + iResultado);
		System.out.println(iResultado);
		
		leer.close();
		

	}


}
