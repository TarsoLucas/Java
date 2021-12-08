package exerciciosCondicional;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Exercício 3
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int quociente = A%B;
		int quociente2 = B%A;
				
				
		if(A>B)
			if (quociente==0)
				System.out.println("São múltiplos");
			else
				System.out.println("Não são múltiplos");
			
		else
			if(quociente2==0)
				System.out.println("São múltiplos");
			else
				System.out.println("Não são múltiplos");
			
			
			
		sc.close();

	}

}
