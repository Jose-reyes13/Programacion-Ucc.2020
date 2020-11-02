import java.util.Scanner;

public class ejercicio04 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		double nota1, nota2, nota3;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("primer nota");
			nota1 = leer.nextDouble();
			System.out.println("segunda nota ");
			nota2 = leer.nextDouble();
			System.out.println("tercera nota");
			nota3 = leer.nextDouble();
		}
		double NotaDefinitiva = (nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4);
		 
		System.out.println(" l nota definitiva es: " + NotaDefinitiva);
		
		}
		}