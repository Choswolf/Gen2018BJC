package com.algoritomopoo.main;

import com.algoritomopoo.misclases.Mascota;
import java.util.Scanner;

public class AppAlbergue {

	public static void main(String[] args) 
	{
		Mascota objPerro1 = new Mascota();
		Mascota objPerro2 = new Mascota("2P2","Ringo","Labrador","Gordito");
		Mascota objPerro3 = new Mascota();
		Scanner leer = new Scanner(System.in);
		
		
		objPerro1.setId("1P1");
		objPerro1.setNombre("Firulais");
		objPerro1.setRaza("Labrador");
		objPerro1.setDescripcion("ORejona");
		
		System.out.println("Id: ");
		objPerro3.setId(leer.next());
		System.out.println("Nombre: ");
		objPerro3.setNombre(leer.next());
		objPerro3.setRaza(leer.next());
		objPerro3.setDescripcion(leer.next());
		
		System.out.println("El id es : "+objPerro1.getID());
		System.out.println("El Nombre es : "+objPerro1.getNombre());
		System.out.println("El Raza es : "+objPerro1.getRaza());
		System.out.println("El Descripcion es : "+objPerro1.getDescripcion());
		
		System.out.println("El id es : "+objPerro2.getID());
		System.out.println("El Nombre es : "+objPerro2.getNombre());
		System.out.println("El Raza es : "+objPerro2.getRaza());
		System.out.println("El Descripcion es : "+objPerro2.getDescripcion());
		
		System.out.println("El id es : "+objPerro3.getID());
		System.out.println("El Nombre es : "+objPerro3.getNombre());
		System.out.println("El Raza es : "+objPerro3.getRaza());
		System.out.println("El Descripcion es : "+objPerro3.getDescripcion());
		
		leer.close();
		
	}

}
