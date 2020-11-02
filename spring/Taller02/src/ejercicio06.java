import java.util.Scanner;

public class ejercicio06 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		double costo = 0, pago = 0, devolucion;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println(" ingrese el costo del articulo");
			costo = leer.nextDouble();
			System.out.println(" ingrese el efectivo del cliente");
			pago = leer.nextDouble();
			
			devolucion = pago - costo;
			System.out.println("el valor a devolver es: " +devolucion);
			
			
			
			
		}
	}
}

			
		
		
			
			
			