package exerciciosCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// Exercício 7
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas do ponto:");
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x==y && x==0)
			System.out.println("Origem");
		else if (x==0)
			System.out.println("Eixo X");
		else if (y==0)
			System.out.println("Eixo Y");
		else if (x>0 && y>0)
			System.out.println("1°Q");
		else if (x>0 && y<0)
			System.out.println("4ºQ");
		else if (x<0 && y>0)
			System.out.println("2°Q");
		else if (x<0 && y<0)
			System.out.println("3°Q");
		
		
		
		sc.close();

	}

}
