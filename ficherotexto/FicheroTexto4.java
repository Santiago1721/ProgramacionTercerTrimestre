package ficherotexto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FicheroTexto4 {
	public static void main(String [] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("c:\\users\\HP EliteDesk\\asignatura.txt"));
			
			String linea = "";
			
			System.out.println("asignaturas de 1 DE DAM");
			
			while (linea != null) {
				
			linea = br.readLine();
			
			if(linea != null) {
				System.out.println(linea);
				
			}
		
		
		}
		
		br.close();
		
	} catch (IOException ioe) { //que hacer si hay un error en la lectura del fichero
		
		System.out.println("no se puede leer el fichero asignatura.txt");
	}

}
}
