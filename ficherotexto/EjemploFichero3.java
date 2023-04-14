package ficherotexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EjemploFichero3 {
	public static void main(String [] args) {
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\users\\Hp EliteDesk\\asignatura.txt"));
			
			bw.write("Programacion\n");
			bw.write("Bases de datos\n");
			bw.write("Entorno de desarrollo\n");
			bw.write("lenguaje de marcas\n");
			bw.write("Sistemas Informaticos\n");
			bw.write("Formacion Laboral");
			
			bw.close();
			
			System.out.println("el archivo ha sido creado correctamente");
					
		} catch (IOException e) {
			
			System.out.println("Error al crear el archivo " + e.getMessage());
		}
		
	}

}
