
public class ejercicio13 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		int caracol = 0, cienpies = 0, gusano = 0, cuentaca = 0, cuentaci = 0, cuentagu = 0;
		
		for (caracol = 0; caracol < 10; caracol++) {
			if (caracol % 1 == 0) {
				cuentaca += 1;
			}
		}
		System.out.println("el caracol tarda "+cuentaca+" dias en subir el muro");
			
		for (cienpies = 0; cienpies < 10; cienpies++) {
			if (cienpies % 1 == 0) {
					cuentaci += 1;
				}
			}
			
        System.out.println("el cienpies tarda "+cuentaci+" dias en subir el muro");
			
		for (gusano = 0; gusano < 10; gusano++) {
			if (gusano % 2 == 0) {
					cuentagu += 1;
				}
			}
			
		System.out.println("el gusano tardaria "+cuentagu+" dias en subir el muro");
		}
	}

				


