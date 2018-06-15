package com.algoritmosbasicos.main;
import java.util.Scanner;

public class AppSuma2Numeros 
{
	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		int iNum1=0 , iNum2=0,iResultado=0;
		System.out.println("Te sumare 2 Numeros");
		System.out.println("Dame el primero");
		iNum1= leer.nextInt();
		System.out.println("Dame el segundo");
		iNum2= leer.nextInt();
		iResultado = iNum1 + iNum2;
		System.out.println("El resultado es "+ iResultado);
		
		leer.close();
		
				
		
	}
}

