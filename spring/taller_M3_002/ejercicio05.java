package taller_M3_002;

import java.util.Scanner;

public class ejercicio05 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("                                            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		int numero, i=0, d, mayor=0;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("ingrese un numero: ");
			numero = leer.nextInt();
		}
		while (numero > 0) {
			if (i==0) {
				d=numero % 10;
				mayor=d;
				numero =numero / 10;
				i++;
				
			}
			else {
				d = numero % 10;
				numero = numero / 10;
				if (mayor < d) {
					mayor = d;
				}
			}
		    }
		System.out.println("el digio mayor es: " +mayor);
		
		
				}
			
			
		}
		
		
	
