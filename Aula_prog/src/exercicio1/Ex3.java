package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Exerc�cio 4
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D;
		
		System.out.println("Digite 4 inteiros:");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.println("A diferen�a dos produtos de A e B por C e D �: " + diferenca);
		
		sc.close();
		
	}

}
