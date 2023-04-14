package ficherotexto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class EjemploFichero6 {
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("c:\\prueba\\pares.txt"))) {
			
			String linea;
			
			while ((linea = br.readLine()) != null){
				
				System.out.println(linea);
				
			}
			
			
		} catch (IOException e){
			
			System.out.println("Error al leer el fichero pares.txt");
		}
	}

}
