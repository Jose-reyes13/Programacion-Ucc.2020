import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
	int numero = 0;
	
	try (Scanner leer = new Scanner(System.in)){
		System.out.println("ingresar el numero para saber su valor absoluto: ");
		numero = leer.nextInt();
	}
	
	System.out.println("mel valor absoluto es: |" +Math.abs(numero)+"|");
	
	
	}
}
		