package ficherotexto;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EjemploFichero10 {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader lector = new BufferedReader(new FileReader("c:\\prueba\\DiasSemana.txt"));
			
			String linea = "";
			
			System.out.println("dias de la semana");
			
			while (linea != null) {
				
				linea = lector.readLine();
				
				if(linea != null){
				System.out.println(linea);
				}
			}
		
		lector.close();
		
	}catch (IOException ioe) { 
		System.out.println("no se puede leer el fichero dias de la semana");
	}
		
	}

}
