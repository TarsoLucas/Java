package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		
		//exerc�cio 2
		
				Locale.setDefault(Locale.US);
				Scanner sc1 = new Scanner(System.in);
				
				System.out.println("Digite o valor do raio para receber a �rea do c�rculo:");
				
				double raio;
				raio = sc1.nextDouble();
				double raio2 = Math.pow(raio, 2);
				
				System.out.printf("O valor da �rea do c�rculo �: %.4f%n", raio2*(3.14159));
				
				
				sc1.close();
				

	}

}
