import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		Double valorH, HorasT, Salario, HorasEX = null, PagoHex;
		
		try (Scanner leer = new Scanner(System.in)){
			System.out.println(" Ingrese el valor de la hora laboral: ");
			valorH = leer.nextDouble();
			System.out.println(" Ingrese la cantidad de horas trabajadas:");
			HorasT = leer.nextDouble();
			
			if (HorasT>48) {
				HorasEX = HorasT-48;
			}
			PagoHex= HorasEX * 0.2 * valorH;
			
			Salario = ( HorasT- HorasEX)* valorH + PagoHex;
			
			System.out.println ( " Su salarioes de: " +Salario);
			
		}
	}
}

			

