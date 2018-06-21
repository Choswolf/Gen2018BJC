package com.archivos.application;

import java.io.*;
public class AppArchivos1 {
	
	public static void main(String[] args) {
		File archivo =null;
		FileReader reader = null;
		BufferedReader buffer = null;
	
		try 
		{
			//Abrimos el Archivo
			archivo = new File("c:\\b\\testo.txt");
			
			//Asignamos un reader al onjeto de tipo archivo
			reader = new FileReader(archivo);
			
			//Creamos un buffer para hacer una lectura comoda del archivo. Para disponer del metodo readLine()
			buffer = new BufferedReader(reader);
			
			// Leemos el archivo
			System.out.println("Contenido del Archivo");
			System.out.println("------------------------------------------");
			String linea = "";
			while ((linea = buffer.readLine()) != null){
				System.out.println(linea);
			}
		}
		
		catch(IOException ioe){
			ioe.printStackTrace();
			
		}
		
		finally {
			try {
				if (reader!=null)
					reader.close();
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
