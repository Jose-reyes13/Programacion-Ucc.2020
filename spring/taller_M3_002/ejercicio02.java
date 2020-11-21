package taller_M3_002;

import java.util.Scanner;

public class ejercicio02 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("                                            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		int numero, tsuma=0;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese un numero para sumar sus digitos: ");
			numero = leer.nextInt();
			
		}
		
		while (numero > 0) {
			tsuma += numero % 10;
			numero = numero / 10;
		}
		
		System.out.println("Los digitos sumados dan: "+tsuma);
		
			
		}
		
	}

