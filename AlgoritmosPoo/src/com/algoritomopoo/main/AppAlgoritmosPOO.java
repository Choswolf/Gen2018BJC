package com.algoritomopoo.main;
import com.algoritomopoo.misclases.Libro;
import java.util.Scanner;

public class AppAlgoritmosPOO 
{

	public static void main(String[] args) 
	{
		
		//System.out.println("Hola Mundo POO ");
		Libro objLibro1;
		objLibro1 = new Libro();
		Libro objLibro2;
		objLibro2 = new Libro();
		Libro objLibro3 = new Libro();
		char cPastaDura;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(objLibro1.getClass()+ "\n");
		
		objLibro1.ISBN="101B";
		objLibro1.Autor="JgnzSval";
		objLibro1.noHojas=250;
		objLibro1.iAnio=1998;
		objLibro1.Titulo="Metafísica";
		objLibro1.precio=400.0;
		objLibro1.isPastaDura=true;
		
		System.out.println("El libro: " + objLibro1.Titulo + "\ndel Autor: " 
		+ objLibro1.Autor + "\ncon ISBN: " + objLibro1.ISBN + "\nque contiene " 
		+ objLibro1.noHojas + " hojas\n" + "Publicado el año: " + objLibro1.iAnio 
		+ "\nPasta dura?: " + objLibro1.isPastaDura + "\nTiene el precio de: "
		+ objLibro1.precio + " pesos\n\n");
		
		System.out.println("Introduce el nombre del Libro: ");
		objLibro2.Titulo = entrada.nextLine();
		System.out.println("Introduce el ISBN: ");
		objLibro2.ISBN = entrada.nextLine();
		System.out.println("Introduce el nombre del Autor: ");
		objLibro2.Autor = entrada.nextLine();
		System.out.println("Introduce el Año en que se publicó: ");
		objLibro2.iAnio = entrada.nextInt();
		System.out.println("Introduce el número de hojas: ");
		objLibro2.noHojas = entrada.nextInt();
		System.out.println("Introduce el precio del Libro: ");
		objLibro2.precio = entrada.nextDouble();
		System.out.println("Es de pasta dura? (S/N)");
		cPastaDura = entrada.next().charAt(0);
		if(cPastaDura == 'S' || cPastaDura == 's')
		{
			objLibro2.isPastaDura=true;
		}
		else objLibro2.isPastaDura=false;
		
		//Imprime estado Libro 2
		System.out.println("\nEl libro: " + objLibro2.Titulo + "\ndel Autor: " 
		+ objLibro2.Autor + "\ncon ISBN: " + objLibro2.ISBN + "\nque contiene " 
		+ objLibro2.noHojas + " hojas\n" + "Publicado el año: " + objLibro2.iAnio 
		+ "\nPasta dura?: " + objLibro2.isPastaDura + "\nTiene el precio de: "
		+ objLibro2.precio + " pesos\n\n");
		
		//Imprime estado Libro 3
		System.out.println("El libro: " + objLibro3.Titulo + "\ndel Autor: " 
		+ objLibro3.Autor + "\ncon ISBN: " + objLibro3.ISBN + "\nque contiene " 
		+ objLibro3.noHojas + " hojas\n" + "Publicado el año: " + objLibro3.iAnio 
		+ "\nPasta dura?: " + objLibro3.isPastaDura + "\nTiene el precio de: "
		+ objLibro3.precio + " pesos\n\n");
		
		System.out.println("El libro fue prestado? "
		+ objLibro3.verPrecio("101B"));
		
		entrada.close();
	
	}
}