package exerciciosCondicional;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Exercício 5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto e a quantidade adquirida:");
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();


	}

}
