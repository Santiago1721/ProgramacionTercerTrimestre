package ficherotexto3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ejercicio2 {

	    public static void main(String[] args) {
	        File carpetaClientes = new File("clientes");
	        if (!carpetaClientes.exists()) {
	            carpetaClientes.mkdir();
	        }

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ingresa el nombre de usuario: ");
	        String nombreUsuario = sc.nextLine();

	        System.out.print("Ingresa la contraseña: ");
	        String contrasena = sc.nextLine();

	        String nombreArchivo = "clientes/" + nombreUsuario + ".txt";
	        File archivoUsuario = new File(nombreArchivo);

	        try {
	            FileWriter writer = new FileWriter(archivoUsuario);
	            writer.write(contrasena);
	            writer.close();
	            System.out.println("Usuario registrado exitosamente.");
	        } catch (IOException e) {
	            System.out.println("Ha ocurrido un error al registrar al usuario.");
	        }
	    }
	}

	


