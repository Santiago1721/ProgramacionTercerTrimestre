package ficherotexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFicheros7 {
	public static void main(String [] args) {
		
		try {
			BufferedReader br1 = new BufferedReader(new FileReader("c:\\prueba\\fichero1.txt"));
			
			BufferedReader br2 = new BufferedReader(new FileReader("c:\\prueba\\fichero2.txt"));
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\prueba\\mezcla.txt"));
			
			String linea1 = "";
			
			String linea2 = "";
			
			while ( (linea1 != null ) || (linea2 != null)) {
				
				linea1 = br1.readLine();
				
				linea2 = br2.readLine();
				
				if (linea1 != null) {
					bw.write(linea1 + "\n");
				}
				
				if (linea2 != null) {
					bw.write(linea2 + "\n");
				}
			}
			
			br1.close();
			br2.close();
			bw.close();
			
			System.out.println("archivo mezcla.txt creado satisfactoriamente.");
		} catch (IOException ioe) {
			System.out.println("se ha producido un error de lectura/escritura");
			
			System.err.println(ioe.getMessage());
		}
		
	}

}
