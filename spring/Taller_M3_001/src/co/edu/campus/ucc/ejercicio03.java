package co.edu.campus.ucc;

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
		
		
		String ubicacion="";
		String tamaño="";
		double valor=0;
		double minuto=0;
		
		try (Scanner leer = new Scanner(System.in)){
			System.out.println("Digite la ubicacion");
			ubicacion = leer.nextLine();
			
		switch (ubicacion) {
		    case "norte":
		    	System.out.println("digite el tamaño del telefono");
		    	tamaño = leer.nextLine();
		    	System.out.println("Digite la cantidad de minutos");
		    	minuto = leer.nextDouble();
		    	switch (tamaño) {
		    	    case "grande":
		    	    	valor=500*minuto;
		    	    	break;
		    	    case "mediano":
		    	    	valor=250*minuto;
		    	    	break;
		    	    case "pequeño":
		    	    	valor=100*minuto;
		    	    	break;
	           default: System.out.println("Digite un tamaño valido");
		    	}
		    break;
		    
		    
		    case "sur":
		    	System.out.println("Digite el tamaño del telefono");
		    	tamaño = leer.nextLine();
		    	System.out.println("Digite la cantidad de minutos");
		    	minuto = leer.nextDouble();
		    	switch (tamaño) {
		            case "pequeño":
		            	valor=400*minuto;
		            	break;
		            case "mediano":
		            	valor=200*minuto;
		            	break;
		        default: System.out.println("Digite un tamaño valido");
		    	}
		    break;
		    
		    case "oriente":
		        System.out.println("Digite el tamaño del telefono");
		        tamaño = leer.nextLine();
		        System.out.println("Digite la cantidad de minutos");
		        minuto = leer.nextDouble();
		        switch (tamaño) {
		            case "grande":
		            	valor=100*minuto;
		            	break;
		        default: System.out.println("Digite un tamaño valido");
		        }
		    break;
		    
		    case "occidente":
		    	System.out.println("Digite el tamaño del telefono");
		    	tamaño = leer.nextLine();
		    	System.out.println("Digite la cantidad de minutos");
		    	minuto = leer.nextDouble();
		    	switch (tamaño) {
		    	    case "pequeño":
		    	    	valor=300*minuto;
		    	    	break;
		    	    case "grande":
		    	    	valor=200*minuto;
		    	    	break;
		    	default: System.out.println("Digite un tamaño valido");
		    	}
		    break;
		    
		    default:
		    	System.out.println("ingresa una ubicacion valida");
		}
		
		System.out.println("el valor a pagar es: "+valor);
		
		    	}
			
		}
		
	}

