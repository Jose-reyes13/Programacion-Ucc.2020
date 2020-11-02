import java.util.Scanner;

public class ejercicio05 {
	private static String nombre;

	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		setNombre("");
		Double salario, descuento, valordelpago;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println(" Nombre del empleado");
			setNombre(leer.next());
			System.out.println(" salario ");
			salario = leer.nextDouble();
			System.out.println(" descuento");
			descuento = leer.nextDouble();
		}
		
		valordelpago = salario - descuento;
		
	
	System.out.println(" El valor a pagar es: " + valordelpago);
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		ejercicio05.nombre = nombre;
	}

}
