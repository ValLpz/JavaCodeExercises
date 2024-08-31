package com.coding;

import java.util.Scanner;

public class MangosNaranjas {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Ingresa un número de mangos: ");
	int mangosNum = scn.nextInt();
	
	System.out.println("Ingresa un número de naranjas: ");
	int naranjasNum = scn.nextInt();
	for (int i = 1; i <= mangosNum / 2; i++ ) {
		if (mangosNum % i == 0) {
			//return i;
			System.out.println("El número de  es  " + i + "para la cantidad de " + mangosNum + "mangos");	}
		}
		
	for (int i = 1; i <= naranjasNum / 2; i++ ) {
		if (naranjasNum % i == 0) {
			//return i;
			System.out.println("El número de  es  " + i + "para la cantidad de " + naranjasNum + "naranjas");	}
				}

			
		}
}
