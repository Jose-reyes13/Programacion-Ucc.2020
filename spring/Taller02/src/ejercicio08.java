import java.util.Scanner;

public class ejercicio08 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		double minutosp=2, pagm=0.5, pag=0, minutosf=0, pagc=0, tiempoc=0;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println(" ingrese la cantidad de paginas: ");
			pag = leer.nextDouble();
			System.out.println(" ingrese el tiempo en minutos para calcular paginas:");
			tiempoc = leer.nextDouble();
			
			{
				
				minutosf=pag*minutosp;
				pagc=tiempoc*pagm;
				
				System.out.println("el tiempo estimado en minutos para escribir es: " +minutosf);
				System.out.println(" las paginas que se escribiran en ese tiempo son: "+pagc);
				
			}
		}
		
	}
	

}
