package exercicio1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//exerc�cio 1
		
		Scanner sc = new Scanner(System.in);
	
		
		int a, b;
		
		System.out.println("Digite o primeiro n�mero:");
		a = sc.nextInt();
		System.out.println("Digite o segundo n�mero:");
		b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("O valor da soma �: " + soma);
		
		
		
		sc.close();
	

	}

}
