package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		
		//exercício 2
		
				Locale.setDefault(Locale.US);
				Scanner sc1 = new Scanner(System.in);
				
				System.out.println("Digite o valor do raio para receber a área do círculo:");
				
				double raio;
				raio = sc1.nextDouble();
				double raio2 = Math.pow(raio, 2);
				
				System.out.printf("O valor da área do círculo é: %.4f%n", raio2*(3.14159));
				
				
				sc1.close();
				

	}

}
