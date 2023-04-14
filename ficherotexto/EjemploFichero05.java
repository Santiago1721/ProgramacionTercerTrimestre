package ficherotexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFichero05 {

	public static void main(String[] args) {
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\prueba\\pares.txt"));
			
			int count = 0;
			
			for (int i = 2; i <= 100; i += 2) {
				
				bw.write(Integer.toString(i) + "\n");
				
				count++;
			}
			
			bw.close();
			
			System.out.println("se ha creado el fichero 'pares.txt");
			System.out.println("Se ha guardado "+ count +" numeros pares");
		} catch (IOException ioe) {
			
			System.out.println("no se ha podido escribir en el fichero");
		}
	

	}

}
