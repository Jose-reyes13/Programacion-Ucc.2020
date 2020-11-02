import java.util.Scanner;

public class ejercicio03 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		int a,b;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("escriba el primer numero");
			a = leer.nextInt();
			System.out.println("esacribir el segundo numero");
			b = leer.nextInt();
				
		}
		
		int suma = a + b;
		int resta = a - b;
		int producto = a * b;
		double promedio = (a + b) / 2;
		
		System.out.println(" Los resultados son los siguientes:");
		System.out.println(" La suma es: " +suma);
		System.out.println(" La resta es: " +resta);
		System.out.println(" El producto es: " +producto);
		System.out.println(" El promedio es: " +promedio);
	}
		
}
