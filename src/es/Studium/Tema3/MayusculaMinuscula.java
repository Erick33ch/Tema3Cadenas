package es.Studium.Tema3;

import java.util.Scanner;

public class MayusculaMinuscula {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	//Varible
		String min, may;
	//Inicio
		System.out.println("Escribe un texto");
		min = teclado.nextLine();
		System.out.println("Escribe otro texto");
		may = teclado.nextLine();
		teclado.close();
		System.out.println(min.toUpperCase());
		System.out.println(may.toLowerCase());	
	}

}
