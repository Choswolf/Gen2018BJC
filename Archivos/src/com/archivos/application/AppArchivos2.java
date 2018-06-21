package com.archivos.application;

import java.io.*;
public class AppArchivos2 {

	public static void main(String[] args) {
		FileWriter archivo = null;
		PrintWriter writer= null;
		try {
			//Abrir el archivo a escribir en el.
			archivo = new FileWriter("c:\\b\\testo.txt",true);
			//Creamos el objeto writer para escribrir en el archivo.El segundo parametro es el parametro Append, si lo colocamos a true, añadimos al archivo. Si lo colocamos a false sobreescribimos al archivo.
			writer = new PrintWriter(archivo);
			System.out.println("Escribo en el archivo");
			writer.println("Holo");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(writer!=null) {
					writer.close();
				}
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
		}

	}

}
