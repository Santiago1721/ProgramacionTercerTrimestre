
import java.util.Scanner;
import java.util.Random;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Riego {
	
	
	
	static Scanner lector = new Scanner(System.in);
		static int hora;
		

	public static void main(String[] args) {
		
		
		while(true) {
			String estacion = obtenerEstacion();
			switch(estacion) {
			case "verano":
				System.out.println("Que hora es");
			    hora = lector.nextInt();
			    
				Boolean comprobar = comprobarHora(hora,estacion);
					if (comprobar == true) {  //es lo mismo if (comprobar)
						System.out.println(regar());
					}
					else {
						esperarUnMinuto();
					}
					break;
					case "otoño":
					case "primavera":
						hora = dameHora();
						if( puedoRegar(estacion,hora)) {
							regar();
						}else {
							System.out.println("no podemos regar aun.");
							esperarUnMinuto();
						}
						
					break;
				}
			}
		} private static Boolean puedoRegar(String estacion, int hora2) {
			
			if(estacion.equals("primavera")  && hora >= 19) {
				return true;
			}
			if(estacion.equals("Otoño") && hora >= 18) {
				return true;
			}
			
			return false;
			
		}
		
		private static int dameHora() {
			
			int hora = 0;
			
			long millis = System.currentTimeMillis();
		
			
			long millis2 = millis / (60 * 1000);
		
			
			int tMinCurrent = (int) (millis2 % (24 * 60));
		
			
			int hours = tMinCurrent / 60;

			
			int minutes = tMinCurrent % 60;
	
			
            return hours;
		}
			
			switch(estacion) {
			case "verano":
				if(hora >= 21 && hora <= 23) {
					obtenerTemperatura()
					
				}
				
				break;
				
				default;
				
				break;
			}
			
		}
		
		private static Boolean comprobarHora(int hora, String estacion) {
			 switch (estacion) {
			 case "verano":
			 int temperatura = obtenerTemperatura();
			 System.out.println("Temperatura " +temperatura);
			      if (hora >= 21 && hora  <= 23 && temperatura <= 30) {
			    	  return true;
			    	  
			      }else {
			      }
		}
			 
			 private static String regar() {
				 return "Regando";
			 }
		
		private static int obtenerTemperatura() {
			Random r = new Random();
			
			return r.nextInt(25, 35);
			
		}
		
		private static String obtenerEstacion(Boolean lectura) {
			String txt="";
			
			try {
				FileReader fr= new FileReader("estacion.txt");
				
				int valor = fr.read();
				while(valor != -1) {
					txt += (char)valor;
					valor = fr.read();
					
				}
			}catch(Exception e) {
				System.out.println("Error al leer el fichero, no existe, pero lo creamos");
				
				try {
					FileWriter fw = new FileWriter("Estacion.txt");
					fw.write("Primavera");
					
					fw.close();
					
				}catch (IOException e1) {
					e1.printStackTrace();
					
		
	}
		}
			
			return txt;
		}
		}
		}

			
			    
		
