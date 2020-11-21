package taller_M3_002;

import java.util.Scanner;

public class ejercicio03 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("                                            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		int numero, invertido=0, cifra, aux;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrase el nuemero para comprobar si es capicua: ");
			numero = leer.nextInt();
		}   while (numero < 10);
		
		aux = numero;
		while (aux != 0) {
			cifra = aux % 10;
			invertido = invertido * 10 + cifra;
			aux = aux / 10;
		}
		
	if (numero == invertido) {
		System.out.println("Es capicua");
	}
	else {
		System.out.println("No es capicua");
		}
	
	}

}
