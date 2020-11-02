import java.util.Scanner;

public class ejercicio07 {
		public static void main(String[] args) {
			System.out.println("+------------------------------------------+");
			System.out.println("            Jose Reyes Arias                ");
			System.out.println("          31 de octubre del 2020            ");
			System.out.println("--------------------------------------------");
			System.out.println(" Progama entrada manual: lectura del teclado");
			System.out.println("--------------------------------------------");
			System.out.println();
			
			double  Valorporhora, horas, salario;
			String Nombre="";
			
			try (Scanner leer = new Scanner(System.in)) {
				System.out.println(" ingrese el nombre del trabajador");
				Nombre = leer.nextLine();
				System.out.println(" ingrese el valor de la hora");
				Valorporhora = leer.nextDouble();
				System.out.println(" ingrese la cantidad de horas trabajadas");
				horas = leer.nextDouble();
				
				salario = horas * Valorporhora;

				System.out.println( "el salario a pagar es: " +salario);
				
					
			
			
		}}
}
