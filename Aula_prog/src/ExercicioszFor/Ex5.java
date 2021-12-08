package ExercicioszFor;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número para saber seu fatorial (!).");
		
		int n = sc.nextInt();
		int fat = 1;
		
		for (int i=(n-1); i>0; i--) {
			n *= i;
		}
		
		if (n!=0)
			System.out.println(n);
		else
			System.out.println(fat);
		
		
		sc.close();	

	}

}
