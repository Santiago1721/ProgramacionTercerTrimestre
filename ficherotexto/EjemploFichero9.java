package ficherotexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFichero9 {

	public static void main(String[] args) {
		
		try {
		
			
			String cuenta = "";
			
			try (BufferedReader br = new BufferedReader(new FileReader("c:\\prueba\\condicion.txt"))) {
				if(cuenta == "45") {
					System.out.println("este es el numero de 45 que hay en tu archivo " +cuenta);
				}
				
				else {
					System.out.println("archivo no tiene el numero 45");
				}
				
				System.out.println("contenido del fichero condicional");
				
				while ((cuenta = br.readLine()) != null) {
					System.out.println(cuenta);
					
				}
			}
			
			
		   
		} catch (IOException e){
			
			System.out.println("Error al leer el fichero de numeros");
		}
	

	}
}





