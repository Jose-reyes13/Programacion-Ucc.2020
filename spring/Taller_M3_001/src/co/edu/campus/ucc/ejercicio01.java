package co.edu.campus.ucc;

import java.util.Scanner;

public class ejercicio01 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		
		String nombre="";
		double sueldo=0, sueldo2=0;
		int cate;
		
		try (Scanner leer = new Scanner(System.in)){
			System.out.println("Digite el nombre del trabajador");
			nombre = leer.next();
			System.out.println("Digite la categoria por favor");
			cate = leer.nextInt();
			System.out.println("Digite el sueldo");
			sueldo =leer.nextDouble();
		}
		
		switch(cate) {
		case 1:
			sueldo2=sueldo*1.15;
			break;
		case 2:
			sueldo2=sueldo*1.10;
			break;
		case 3:
			sueldo2=sueldo*1.8;
			break;
		case 4:
			sueldo2=sueldo*1.7;
			break;
		default:
		case 0:
			System.out.println("la categoria no existe");
			break;
			
		} System.out.println("El sueldo a pagar a "+nombre+" es: "+sueldo2);
		
		
		}
		
	}


