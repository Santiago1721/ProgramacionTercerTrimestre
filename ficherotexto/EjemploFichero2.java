package ficherotexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFichero2 {
	public static void main(String [] args) {
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\prueba\\clientes.txt",true));
			
			//no añade, pisa el fichero con los dsatos que se meta si se ejecuta de nuevo
			
			bw.write("Bernardo\n");
			bw.write("Eva\n");
			bw.write("laura\n");
			bw.write("antonio\n");
			System.out.println("Fichero creado");
			
			bw.close();
		}catch (IOException ioe) {
			System.out.println("no se a podido escribir en el fichero");
		}
		   
	}

}
