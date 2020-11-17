package co.edu.campus.ucc;

import java.util.Scanner;

public class ejercicio02 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("            Jose Reyes Arias                ");
		System.out.println("          31 de octubre del 2020            ");
		System.out.println("--------------------------------------------");
		System.out.println(" Progama entrada manual: lectura del teclado");
		System.out.println("--------------------------------------------");
		System.out.println();
		
	int semestre=0;
	String nombre="", carrera="";
	double  total=0;
	
	try (Scanner leer = new Scanner(System.in)) {
		System.out.println("Nombre del estudiante");
		nombre = leer.next();
		System.out.println("Digite nombre de la carrera");
		carrera = leer.next();
		System.out.println("semestre");
		semestre = leer.nextInt();
		
	}
	
	switch(semestre) {
	case 1:
	case 2:
	case 3:
		break;
	case 4:
	case 5:
	case 6:
	case 7:
		total=2220+4000+5000;
		break;
	case 8:
	case 9:
	case 10:
		total=3000+6000+7000;
		break;
		
	default:
	case 0:
		System.out.print("semestre incorrecto");
		break;
		
	} System.out.println("el valor a pagar para "+nombre+" del programa de "+carrera+" es: " +total);
	
		
	
		
	}
	
	
	
	}

		


