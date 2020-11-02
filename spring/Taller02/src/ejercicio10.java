import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
	int numero = 0, sumaDig = 0;
	
	try (Scanner leer = new Scanner(System.in)) {
		System.out.println(" Ingrese el numero que quiere sumar sus digitos: ");
		numero =leer.nextInt();
	}
		
	int num = numero;
	
	           while (numero != 0 ) {
	        	   sumaDig = sumaDig + (numero % 10);
	        	 
	        	   
	        	   numero = numero / 10;
	           }
	        System.out.println("La suma de los digitos de " + num + " es :" + sumaDig);
	}
	}
	        	   
	      
	        	   
	     
	
