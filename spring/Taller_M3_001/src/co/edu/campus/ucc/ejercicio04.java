package co.edu.campus.ucc;

import java.util.Scanner;

public class ejercicio04 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		
		String cod="";
		double valort=0;
		int cant=0;
		
		try (Scanner leer =new Scanner(System.in)) {
			System.out.println("Digite el codigo del priducto");
			cod = leer.nextLine();
			
		switch (cod) {
		    case "a":
		    	System.out.println("Digite la cantidad por el cliente");
		    	cant = leer.nextInt();
		    	switch (cant) {
		    	    case 501:
		    	    	valort=cant*500*1.7;
		    	    	break;
		    	    case 500:
		    	    	valort=cant*1000*1.9;
		    	    	break;
		    	default:
		    	}
		    break;
		    case "b":
		    	System.out.println("Digite la cantidad solicitada por el cliente");
		    	cant = leer.nextInt();
		    	switch (cant) {
		    	    case 501:
		    	    	valort=cant*800*1.8;
		    	    	break;
		    	    case 500:
		    	    	valort=cant*1400*1.11;
		    	    	break;
		    	default:
		    	}
		    break;
		    
		    case "c":
		    	System.out.println("Digite la cantidad solicitada por el cliente");
		    	cant = leer.nextInt();
		    	switch (cant) {
		    	    case 501:
		    	    	valort=cant*1000*1.5;
		    	    	break;
		    	    case 500:
		    	    	valort=cant*1600*1.10;
		    	    	break;
		    	 default:
		    	}
		    break;
		    
		    
        default:
			 System.out.println("ingrese un codigo valido");
		    	}
		}
		
		System.out.println(+valort);
			 
		{
			{
		    	}
		}
		}
	}

		    	
		    	    	
		    	
		    	
		
		
	
