package exerciciosCondicional;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Exercício 2
		
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite um número para saber se ele é par ou ímpar:");
		
		int x = sc.nextInt();
		
		if(x%2==0)
			System.out.println("Par");
		else
			System.out.println("Ímpar");

		
		sc.close();
	}

}
