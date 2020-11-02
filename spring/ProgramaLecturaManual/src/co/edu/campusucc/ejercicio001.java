package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio001 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          30 de octubre del 20202           ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		
		int res1, res2;
		boolean val1 = false, val2= false, k;
	
	try (Scanner leer = new Scanner(System.in)) {
		System.out.println("La tierra es redonda");
		res1 = leer.nextInt();
		System.out.println("25 es cuadrado perfecto");
		res2 = leer.nextInt();
	}
		if (res1 !=0) val1=true;
		if (res2 !=0) val2=true;
		
		k= val1 && val2;
		System.out.println("el valor de la variable k es: "+k);
		
	
		
		
		
	}
}
