package ExercicioszFor;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro.");

		int N = sc.nextInt();
		double n1 = 0;
		double n2 = 0;
		double m;

		for (int i = 0 ; i < N; i++) {

			System.out.println("Digite o par escolhido");

			n1 = sc.nextDouble();
			n2 = sc.nextDouble();

			m = (n1/n2);
			
			if (n2!=0) {
				
				System.out.printf("%.2f%n", m);
				System.out.println();
			}
			else {
				System.out.println("Divisão impossível.");
				System.out.println();
			}
			
		}

		sc.close();

	}

}
