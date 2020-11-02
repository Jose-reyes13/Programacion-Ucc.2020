import java.util.Scanner;

public class ejercicio09 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		Double ValorHora, HorasD, DiasT , HorasT, Salario, Horasex = null, PagoHEx, Desc, PagoT, HorasTo;
		
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println(" Ingrese el valor de la hora laboral: ");
			ValorHora = leer.nextDouble();
			System.out.println(" ingrese la cantidad de dias trabajadas:");
			DiasT = leer.nextDouble();
			System.out.println(" ingrese la cantidad de horas trabajadas:");
			HorasT = leer.nextDouble();
		}
			HorasD=DiasT*8; 
			
			HorasTo=HorasT+HorasD;
			
			
			if (HorasTo > 48) {
				Horasex=HorasTo-48;
			}
			
			PagoHEx=Horasex*0.5*ValorHora;
			
			Salario=(HorasTo-Horasex)*ValorHora+PagoHEx;
			Desc=Salario*0.12;
			PagoT=Salario-Desc;
			
			System.out.println(" Su salario es de: "+Salario);
			System.out.println("El descuento de seguro social es de: " +Desc);
			System.out.println(" Su pago total seria de: "+PagoT);
			
			}
	}
		