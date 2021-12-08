package exerciciosCondicional;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Exercício1
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para saber se ele é positivo ou negativo:");
		int x = sc.nextInt();
		
		if (x<0)
			System.out.println("Negativo");
		else 
			System.out.println("Positivo");
		
		
		sc.close();
	}

}
