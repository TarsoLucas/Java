package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//Exercício 4
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);


		String x ;
		System.out.println("Digite o nome do funcionário:");
		x = sc.next();
		
		System.out.println("Digite o números de horas trabalhadas:");
 		int a = sc.nextInt();
 		
 		
		System.out.println("Digite o valor recebido por hora:");
 		float b = sc.nextFloat();
 		
 		System.out.println("Nome do funcionário: " + x);
 		System.out.printf("Salário: %.2f%n", a*b);
 		
		sc.close();
		
	}

}
