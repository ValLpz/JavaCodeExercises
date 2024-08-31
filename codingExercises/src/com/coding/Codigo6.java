package com.coding;

import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) {
		int n []  = new int [20]; 
		Scanner sn = new Scanner(System.in);

		    for (int i = 0; i < 20; i++) {
		      n[i] = (int)(Math.random() * 381) + 20;
		      System.out.println(n[i] + " ");
		    }
		    
		    System.out.println("\n¿Qué números quiere resaltar? "); 
		    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    int opcion = Integer.parseInt(sn.nextLine());

		    int multiplo = (opcion == 1) ? 5 : 7;

		    for (int e : n) {
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		      } else {
		        System.out.print(e + " ");
		      }
		    sn.close();
		    }
	}
}

 /*Cambios 
  * Declaración correcta de array n de tamaño 20
  * Corrección de sintaxis en System.out.println
  * Corrección de declaración int
  * Corrección de sintaxis en operador ternario
  * 
  * */
  