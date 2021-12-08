package exerciciosCondicional;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Exercício 6
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println( "Digite um número");
		
		double x = sc.nextDouble();
		
		
		if (x<0)
			System.out.println("Está fora do intervalo");
		else if (x>=0&&x<=25)
			System.out.println("Está no intervalo 1");
		else if (x<25&&x<=50)
			System.out.println("Está no intervalo 2");
		else if (x<50&&x<=75)
			System.out.println("Está no intervalo 3");
		else if (x>75&&x<=100)
			System.out.println("Está no intervalo 4");
		else if (x>100)
			System.out.println("Está fora do intervalo");
		
		
		
		sc.close();

	}

}
