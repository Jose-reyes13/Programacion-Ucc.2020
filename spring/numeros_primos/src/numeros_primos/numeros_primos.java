package numeros_primos;

import java.util.Random;

public class numeros_primos {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		
		Random random = new Random ();
		int numero = random.nextInt(1000);
		boolean esPrimo = verificaPrimo (numero);
		System.out.println("El numero "+numero+ " es primo? " +esPrimo);
		
	}
	
	public static boolean verificaPrimo(int numero) {
		boolean esPrimo = true;
		int numerosDivisibles = 0;
		int numerosDivisiblesPrimo=2;
		
		for (int i=1; i<=numero; i++)
			if (numero % i==0)
				numerosDivisibles++;
		
		if (numerosDivisibles == numerosDivisiblesPrimo)
			esPrimo = true;
		
		return esPrimo;
		
		
		
	}
}
