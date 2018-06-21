package com.vectores.application;

import com.vectores.misclases.*;

public class AppVectores2 {

	public static void main(String[] args) 
	{
		int[] vectorEnteros = new int [100];
		Vectores vectors = new Vectores();
		vectorEnteros= vectors.llenaUnos(vectorEnteros);
		
		imprimirVector(vectorEnteros);
		
		
		

	}
	
	public static void imprimirVector(int[] vectorParam)
	{
		for(int i=0;i< vectorParam.length;i++)
		{
			System.out.println(vectorParam[i]);
		}
		
	}

}
