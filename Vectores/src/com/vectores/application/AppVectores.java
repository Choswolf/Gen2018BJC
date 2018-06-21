package com.vectores.application;

public class AppVectores 
{

	public static void main(String[] args)
	{
		//NUM_FACTURAS es la cantidad de facturas que se pueden enviar simultaneamente.
		
		final int NUM_FACTURAS=20;
		boolean[] vecBoolean= new boolean[NUM_FACTURAS];
		int [] vecInt = {10,20,30,40,50,60,70,80,90};
		char [] vecCaracteres = new char[] {'a','b','c','d','e','f','g','h'};
		double[] vecDouble = new double [10];
		String[] vecCadena = new String [] {"hola","Mundito","Joe"};
		System.out.println(vecCadena[1]);
		String iCadena1=vecCadena[1];
		System.out.println(iCadena1);
		System.out.println(iCadena1.charAt(2));
		int[] vecVector1 = new int[100];
		for (int i=0;i<vecVector1.length;i++)
		{
			vecVector1[i]= 1;
		}
		for (int i=0;i<vecVector1.length;i++)
		{
			System.out.println(vecVector1[i]+" POSICION "+i);;
		}
	
	}

}