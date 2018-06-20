package com.stringsproject.application;

public class AppStringsProject 
{
	public static void main(String[] args) {
		String cadena = "Lo que tú almacenas en una variable no primitiva no es el "
				+ "objeto en sí sino una dirección o identificador del objeto en el "
				+ "espacio dinámico de memoria. Cuando pasas por parámetros la variable, "
				+ "estás pasando una copia de dicha dirección.";
		
		String cadena2 = "Lo que tú almacenas en una variable no primitiva no es el "
				+ "objeto en sí sino una dirección o identificador del objeto en el "
				+ "espacio dinámico de memoria. Cuando pasas por parámetros la variable, "
				+ "estás pasando una copia de dicha dirección.";
		
		String cadena3 = "";
		
		String cadena4 = "Hola ";
		
		String cadena5 = "Mundo";
		
		System.out.println("La cantidad de caracteres es: " + cadena.length());
		
		System.out.println("El cuarto caracter es: " + cadena.charAt(4));
		
		if(cadena.compareTo(cadena2)==0)
			System.out.println("Las cadenas son iguales");
		else
			System.out.println("Las cadenas NO son iguales");
		
		System.out.println(cadena4.concat(cadena5));
		System.out.println(cadena4);
		
		if(cadena.contains("objeto"))
			System.out.println("Si existe la frase");
		else
			System.out.println("No existe la frase");
		
		if(cadena.equals(cadena2))
			System.out.println("Las cadenas son iguales");
		else
			System.out.println("Las cadenas NO son iguales");
		
		System.out.println("Encontro el caracter en la posicion: "+cadena.indexOf('e'));
		System.out.println("Encontro el caracter en la posicion: "+cadena.indexOf('e',100));
		System.out.println("Encontro el caracter en la posicion: "+cadena.indexOf("Java"));
		System.out.println("Encontro el caracter en la posicion: "+cadena.indexOf("Java",355));
		System.out.println(cadena);
		
		String [] resultado= cadena.split("sino");

	
		System.out.print(resultado[0]+"    ");
		System.out.println(resultado[1]);
		System.out.println(resultado.length);
		
		System.out.println(cadena.substring(120));
		System.out.println(cadena.substring(31,51));
		
		System.out.println("Cadena en minusculas:"+cadena.toLowerCase());
		System.out.println("Cadena en Mayusculas:"+cadena.toUpperCase());
		
		String cadena7 = "     Hola Munditu!!  ";
		System.out.println("Cadena 7:"+cadena7.trim());
		
		String cadena8="";
		System.out.println(cadena8.valueOf(true));
		
		char caracter='c';
		
		System.out.println(cadena8.valueOf('C'));
		
	
		
		
	
	}
}
