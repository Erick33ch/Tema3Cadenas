package es.Studium.Tema3;

import java.util.Scanner;

public class Longitud {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		// Variantes
		String cad1; 
		
		//INICIO
		System.out.println("Escriba una frase:");
		cad1 = teclado.nextLine();
		teclado.close();
		System.out.println(cad1.length());

	}

}
