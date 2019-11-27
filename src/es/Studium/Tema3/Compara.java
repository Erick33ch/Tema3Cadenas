package es.Studium.Tema3;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	//Varible
		String cad1, cad2;
		
	 //Inicio 
		System.out.println("Dame una nombre");
		cad1 = teclado.next();
		System.out.println("Dame otra nombre");
		cad2 = teclado.next();
		
		if (cad1.compareTo(cad2)<0)
			{
			System.out.println("La primera es mayor");
			}
		
		else if (cad1.compareTo(cad2)==0) 
		{
			System.out.println("son iguales");
		}
		
		else {
			System.out.println("La segunda es mayor");
			}
		teclado.close();
	}

}
