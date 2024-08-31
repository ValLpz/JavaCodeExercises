
/*Cambios 
 * implementación de package
 * imortación de Scanner
 * Importación de HashMap
 * cambio de byte y double por string 
 * Agregar capital faltante y corrección de sintaxis
 * Cerrar Scanner
 * Corrección de sintaxis */
package com.coding; 

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

	public static void main(String[] args) {
		
		   Scanner s = new Scanner(System.in);

		    HashMap<String, String> capitales = new HashMap<>();

		    capitales.put("Canadá", "Ottawa");
		    capitales.put("Estados Unidos", "Washington DC");
		    capitales.put("México", "México DF");
		    capitales.put("Belice", "Belmopán");
		    capitales.put("Costa rica", "San José");
		    capitales.put("El Salvador","San Salvador");
		    capitales.put("Guatemala", "Ciudad de Guatemala");
		    capitales.put("Honduras", "Tegucigalpa");
		    capitales.put("Nicaragua", "Managua");
		    capitales.put("Panamá", "Panamá");
		   
		    String c = "";
		    

		    do {
		      System.out.println(" Escribe el nombre de un país y te diré su capital: ");
		      c = s.nextLine();
		      if (!c.equals("salir")) {
		        if (capitales.containsKey(c)) {
		          System.out.print("La capital de " + c + " es " + capitales.get(c));
		           } else {
		          System.out.println("No conozco la respuesta, ¿Cuuál es la capital de " + c + " ?" );
		          String ca = s.nextLine();
		          capitales.put(c, ca);
		          System.out.println("Gracias por enseñarme nuevas capitales");
		        }
		      }
		    } while (!c.equals("salir"));
		    
		     s.close();
	}

}
