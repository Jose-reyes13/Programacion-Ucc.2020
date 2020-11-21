package taller_M3_002;

import java.util.Scanner;

public class ejercicio06 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("                                            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		int numero=0, i, a=0 ;
		
		try (Scanner leer = new Scanner(System.in))  {
			System.out.println("Ingrese un mumero");
			numero = leer.nextInt();
		}
		
		for (i = 1; i < (numero + 1 ); i++)  {
			if (numero % i == 0) {
				a++;
		}
}
		if (a!=2) {
			System.out.println("no es primo");
		  }else{
			  System.out.println("Si es primo");
			  
		
			}
			
		}
		
	}

