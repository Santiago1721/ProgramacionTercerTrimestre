package ficherotexto3;

import java.io.File;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Ruta del directorio que deseas listar
		        String rutaDirectorio = "ruta_del_directorio";

		        // Crear un objeto File con la ruta del directorio
		        File directorio = new File(rutaDirectorio);

		        // Verificar si el directorio existe
		        if (directorio.exists() && directorio.isDirectory()) {
		            // Obtener la lista de archivos en el directorio
		            File[] archivos = directorio.listFiles();

		            // Verificar si la lista de archivos no es nula
		            if (archivos != null) {
		                // Recorrer la lista de archivos
		                for (File archivo : archivos) {
		                    // Imprimir el nombre de cada archivo
		                    System.out.println(archivo.getName());
		                }
		            } else {
		                System.out.println("El directorio está vacío.");
		            }
		        } else {
		            System.out.println("El directorio no existe.");
		        }
		    }
		}
