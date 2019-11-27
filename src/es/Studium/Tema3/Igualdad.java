package es.Studium.Tema3;

import java.util.Scanner;

public class Igualdad {

	public static void main(String[] args)
	{
	Scanner teclado = new Scanner (System.in);	
	//VARIBLES
	String cad1, cad2;
	//INICIO
	System.out.println("Escribe un texto");
	cad1 = teclado.next();
	System.out.println("Escribe otro texto");
	cad2 = teclado.next();

	
	if (cad1.equals(cad2))
		{
		System.out.println("Es igual");
		}
		else
		{
			System.out.println("No es igual");
		}
	teclado.close();
	}
}
