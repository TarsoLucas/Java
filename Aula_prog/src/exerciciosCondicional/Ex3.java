package exerciciosCondicional;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Exerc�cio 3
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros inteiros");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int quociente = A%B;
		int quociente2 = B%A;
				
				
		if(A>B)
			if (quociente==0)
				System.out.println("S�o m�ltiplos");
			else
				System.out.println("N�o s�o m�ltiplos");
			
		else
			if(quociente2==0)
				System.out.println("S�o m�ltiplos");
			else
				System.out.println("N�o s�o m�ltiplos");
			
			
			
		sc.close();

	}

}
