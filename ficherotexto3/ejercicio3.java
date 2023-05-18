package ficherotexto3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();

        eliminarCarpetaYArchivo();
        guardarCredenciales(usuario, contrasena);

        System.out.println("Las credenciales se han guardado correctamente.");
    }

    public static void eliminarCarpetaYArchivo() {
        String rutaCarpeta = "clientes";
        String nombreArchivo = "usuario.txt";

        File archivo = new File(rutaCarpeta + "/" + nombreArchivo);
        File carpeta = new File(rutaCarpeta);

        // Verificar si el archivo existe y eliminarlo
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("El archivo se ha eliminado correctamente.");
        }

        // Verificar si la carpeta existe y eliminarla
        if (carpeta.exists()) {
            carpeta.delete();
            System.out.println("La carpeta se ha eliminado correctamente.");
        }
    }

    public static void guardarCredenciales(String usuario, String contrasena) {
        String rutaCarpeta = "clientes";
        String nombreArchivo = "usuario.txt";

        try {
            // Crear la carpeta "clientes" si no existe
            crearCarpetaSiNoExiste(rutaCarpeta);

            // Crear el archivo "usuario.txt" dentro de la carpeta "clientes"
            File archivo = new File(rutaCarpeta + "/" + nombreArchivo);

            // Escribir el nombre de usuario y la contraseña en el archivo
            FileWriter fileWriter = new FileWriter(archivo);
            fileWriter.write("Nombre de usuario: " + usuario + "\n");
            fileWriter.write("Contraseña: " + contrasena + "\n");

            // Cerrar el archivo
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar las credenciales.");
            e.printStackTrace();
        }
    }

    public static void crearCarpetaSiNoExiste(String rutaCarpeta) {
        // Crear un objeto File con la ruta de la carpeta
        File carpeta = new File(rutaCarpeta);

        // Verificar si la carpeta no existe
        if (!carpeta.exists()) {
            // Crear la carpeta
            if (carpeta.mkdirs()) {
                System.out.println("La carpeta se ha creado correctamente.");
            } else {
                System.out.println("Ha ocurrido un error al crear la carpeta.");
            }
        }
    }
}