package exerciciosCondicional;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// Exercício 8
		
		
	Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o salário:");
		
		double x = sc.nextDouble();
		double taxa;
		
		if (x<0) {
			System.out.println("????????");
			taxa = -1.00;
		}	
		else if (x<=2000) 
			taxa = 0.00;
	
		else if (x<=3000) 
			taxa = (0.08)*(x-2000);
					
		else if (x<=4500) 
			taxa = (0.08)*(x-2001)+(0.18)*(x-3001);						
										
		else
			taxa = ((x-2001)*0.08)+((x-3001)*0.18)+((x-4501)*0.28);							
		 
	
		if (taxa == 0.00)
			System.out.println("Isento");
		else
			System.out.printf("O valor da taxa é de R$: %.2f", taxa);
					
		
		sc.close();
	}
}
