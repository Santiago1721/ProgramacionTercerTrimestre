package ficherotexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFichero9 {

	public static void main(String[] args) {
		
		try {
			
			BufferedWriter lector = new BufferedWriter(new FileWriter("c:\\prueba\\DiasSemana.txt"));
			
			lector.write("Lunes\n");
			lector.write("Martes\n");
			lector.write("Miercoles\n");
			lector.write("Jueves\n");
			lector.write("Viernes\n");
			lector.write("Sabado\n");
			lector.write("Domingo\n");
			
			lector.close();
			
			System.out.println("el archivo se creo correctamente");
		} catch (IOException e) {
			System.out.println("Error al crear el archivo: " +e.getMessage());
		}
	}
}
		
	

