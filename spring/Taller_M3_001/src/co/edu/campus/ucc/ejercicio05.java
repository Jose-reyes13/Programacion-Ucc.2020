package co.edu.campus.ucc;

import java.util.Scanner;

public class ejercicio05 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		String servicio="";
		int ruta=0, tarifa=0;
		double valort=0;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Digite el tipo de servicio");
			servicio =leer.nextLine();
			
		switch (servicio)  {
		    case "corriente":
		    	tarifa=200;
		    	System.out.println("Digite la ruta");
		    	ruta = leer.nextInt();
		    	switch (ruta) {
		    	    case 1:
		    	    	valort=tarifa-(200*0.30)-(200*0.10);
		    	    	break;
		    	    case 2:
		    	    	valort=tarifa-(200*0.25)-(200*0.15);
		    	    	break;
		    	    case 3:
		    	    	valort=tarifa-(200*0.25)-(200*0.20);
		    	    	break;
		    	    case 4:
		    	    	valort=tarifa-(200*0.22)-(200*0.20);
		    	    	break;
		        default: System.out.println("Digite una ruta valida");
		    	}
		    break;
		    
		    case "ejecutivo":
		    	tarifa=300;
		    	System.out.println("Digite la ruta");
		    	ruta =leer.nextInt();
		    	switch (ruta) {
		    	    case 1:
		    	    	valort=tarifa-(300*0.30)-(300*0.10);
		    	    	break;
		    	    case 2:
		    	    	valort=tarifa-(300*0.25)-(300*0.15);
		    	    	break;
		    	    case 3:
		    	    	valort=tarifa-(300*0.20)-(300*0.20);
		    	    	break;
		    	    case 4:
		    	    	valort=tarifa-(300*0.22)-(300*0.20);
		    	    	break;
		    	default: System.out.println("Digite una rut valida");
		    	}
		    break;
		default: System.out.println("Digite un servicio valido");
		}
		}
		System.out.println("la ganacia de la empresa es: "+valort);
		
		    	}
		
			
		}
		
		
		
	

