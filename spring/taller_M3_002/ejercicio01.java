package taller_M3_002;

import java.util.Scanner;

public class ejercicio01 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("                                            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		int numero, invertido=0, resto;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese un numero: ");
			numero = leer.nextInt();
		}
		
		while (numero > 0) {
			resto = numero % 10;
			invertido = invertido = 10 + resto;
			numero /= 10;
			
		}
		System.out.println("el nuemero invertido es: "+invertido);
		
			
		}
		
		
	}
	
