package com.colecciones.application;
import java.util.Enumeration;
import java.util.*;


public class Vectores {

	public static void main(String[] args) {
		System.out.println("Ejercicio 1");
		Vector <String> vec = new Vector<String>(3);
		vec.add("Elemento 1"); //Método de la clase collections
		vec.addElement("Elemento 2"); //Metodo de la clase Vector
		vec.addElement("Elemento 3"); //Metodo de la clase Vector
		vec.addElement("Elemento 4"); //Metodo de la clase Vector
		vec.addElement("Elemento 5"); //Metodo de la clase Vector
		Enumeration miEnumeracion = vec.elements();
		
		while(miEnumeracion.hasMoreElements())
		{
			System.out.println("Elemento :"+miEnumeracion.nextElement());
		}
		
		System.out.println("\nEjercicio 2");
		
		vec.set(0, "Alementos 1");
		vec.set(1, "Alementos 2");
		vec.set(2, "Alementos 3");
		vec.set(3, "Alementos 4");
		vec.set(4, "Alementos 5");
		
		System.out.println("Elemento 0p: "+vec.get(0));
		System.out.println("Elemento 1p: "+vec.get(1));
		System.out.println("Elemento 2p: "+vec.get(2));
		System.out.println("Elemento 3p: "+vec.get(3));
		System.out.println("Elemento 4p: "+vec.get(4));
		
		

	}

}
