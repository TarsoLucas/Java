package ExercicioszFor;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		
		int N = sc.nextInt();
		double S;
		double C;
		
		for (int i = 1; i<=N; i++) {
			
			S = Math.pow(i,2);
			C = Math.pow(i,3);
			
			System.out.printf("%d %.0f %.0f%n", i, S, C);
		
		}
		sc.close();

	}

}
