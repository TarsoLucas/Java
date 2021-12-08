package ExercicioszFor;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número.");
		
		int N = sc.nextInt();
		int div;
		
		System.out.printf("Divisores de %d: %n", N);
		
		for( int i = N; i>=1; i--) {
			div = N%i;
			
				if (div == 0) {
					System.out.printf("%d%n", i);
				}	
		
		}
		sc.close();

	}

}
