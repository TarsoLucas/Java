package exerciciosCondicional;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Exerc�cio 2
		
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite um n�mero para saber se ele � par ou �mpar:");
		
		int x = sc.nextInt();
		
		if(x%2==0)
			System.out.println("Par");
		else
			System.out.println("�mpar");

		
		sc.close();
	}

}
