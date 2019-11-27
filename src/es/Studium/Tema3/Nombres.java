package es.Studium.Tema3;

import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
	Scanner teclado =  new Scanner (System.in);
	//Variable
		String nombre1, nombre2, nombre3, nombre4, nombre5;
	
	//Inicio
		System.out.println("Dame un primer nombre");
		nombre1 = teclado.next();
		
		System.out.println("Dame un segundo nombre");
		nombre2 = teclado.next();
		
		System.out.println("Dame un tercer nombre");
		nombre3 = teclado.next();
		
		System.out.println("Dame un cuarto nombre");
		nombre4 = teclado.next();
		
		System.out.println("Dame un quinto nombre");
		nombre5 = teclado.next();
		
		teclado.close();
		
		System.out.println(nombre1);
		System.out.println(nombre2);
		System.out.println(nombre3);
		System.out.println(nombre4);
		System.out.println(nombre5);
		
	
	}

}
