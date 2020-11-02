
public class ejercicio01 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		int tela = 0, cantidadt = 0;
		
		for (tela = 2; tela < 12; tela++) {
			if (tela % 2 == 0) {
				cantidadt +=1;
			}
		}
		
		System.out.println(" la tela se corta en "+cantidadt+" dias, cortando de a 2 metros");
		System.out.println(" El sexto dia no se puede cortar porque ya la medida es la necesitada");
		
	}
}
