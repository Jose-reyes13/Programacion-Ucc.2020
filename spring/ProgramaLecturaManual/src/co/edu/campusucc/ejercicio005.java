package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio005 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          30 de octubre del 20202           ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		
		int res1, res2;
		boolean No1 = false, No2= false, k;
	
	try (Scanner leer = new Scanner(System.in)) {
		System.out.println("la tierra es un satelite");
		res1 = leer.nextInt();
		System.out.println("azul es una obra literaria de ruben dario");
		res2 = leer.nextInt();
	}
		if (res1 !=0) No1=true;
		if (res2 !=0) No2=true;
		
		k= No1 && No2;
		System.out.println("el valor de la variable k es: "+k);
		
	

}

}



