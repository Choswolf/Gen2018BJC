package com.algoritmosbasicos.main;

import java.util.Scanner;

public class fibonachi 
{

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		int iNum1=0 , iNum2=0,iLimite=0;
		System.out.println("Te imprimire la serie de Fibonachi");
		System.out.println("Hasta que numero quieres llegar");
		iLimite= leer.nextInt();
		iNum1 = 0; //Primer numero de serie de Fibonacci
		iNum2 = 1; //Segundo numero de serie de Fibonacci
		
		//while
		/* 
		while (iNum1<=iLimite)
		{
			System.out.print(iNum1 + " ");
			iNum1= iNum1 + iNum2;
			if	(iNum2<=iLimite)
			{
				System.out.print(iNum2+ " ");
				iNum2= iNum1 + iNum2;
			}
		}
		
		*/
		//do...while
		/* 
		do
		{
			System.out.print(iNum1 + " ");
			iNum1= iNum1 + iNum2;
			if	(iNum2<=iLimite)
			{
				System.out.print(iNum2+ " ");
				iNum2= iNum1 + iNum2;
			}
		}
		while (iNum1<=iLimite);
		*/
		//for
		for(iNum1 = 0 ,iNum2 = 1;iNum1 <= iLimite;iNum2= iNum1 + iNum2)
		{
			System.out.print(iNum1 + " ");
			iNum1= iNum1 + iNum2;
			if	(iNum2<=iLimite)
			{
				System.out.print(iNum2+ " ");
			}
		}
		
		leer.close();
		
	
		

	}

}
