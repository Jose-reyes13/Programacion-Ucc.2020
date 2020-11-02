import java.util.Scanner;

public class ejercicio02 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		double numero = 0;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("escriba un numero por favor");
			numero = leer.nextInt();
		}
		double cubo = Math.pow(numero, 3);
		
		System.out.println("el cubo del numero es: " + cubo);
			
		}

}
