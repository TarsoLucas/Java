package ExercicioszFor;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um inteiro de 1 a 1000.");
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i+=2) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
