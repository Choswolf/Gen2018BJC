package com.algoritmosbasicos.main;

import java.util.Scanner;

public class fibonachi2 
{

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		int iNum1=0 , iNum2=0 ,iLimite=0 , iContador=0;
		System.out.println("Te imprimire la serie de Fibonachi");
		System.out.println("Hasta que numero quieres llegar");
		iLimite= leer.nextInt();
		iNum1 = 0; //Primer numero de serie de Fibonacci
		iNum2 = 1; //Segundo numero de serie de Fibonacci
		
		//while
		
		while (iContador < iLimite)
		{
			System.out.print(iNum1 + " ");
			iNum1= iNum1 + iNum2;
			iContador++;
			if	(iContador < iLimite)
			{
				System.out.print(iNum2+ " ");
				iNum2= iNum1 + iNum2;
				iContador++;
			}
		}
		
		
		//do...while
		/* 
		do
		{
			System.out.print(iNum1 + " ");
			iNum1= iNum1 + iNum2;
			iContador++;
			if	(iContador < iLimite)
			{
				System.out.print(iNum2+ " ");
				iNum2= iNum1 + iNum2;
				iContador++;
			}
		}
		while (iContador < iLimite);
		*/
		//for
		/* 
		for(iContador=0 ; iContador < iLimite;iContador++)
		{
			System.out.print(iNum1 + " ");
			iNum1= iNum1 + iNum2;
			if	(iContador < iLimite)
			{
				System.out.print(iNum2+ " ");
				iNum2= iNum1 + iNum2;
				iContador++;
			}
		}
		
		*/
		leer.close();

	}

}
