package es.Studium.Tema3;

import java.util.Scanner;

public class Concatena {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//Variables
		String texto1, texto2;
		//Inicio
		System.out.println("Escribir un texto:");
		texto1 = teclado.nextLine();
		System.out.println("Escribir otro texto:");
		texto2 = teclado.nextLine();
		teclado.close();
		System.out.println(texto1 + " " + texto2 );
	}

}
