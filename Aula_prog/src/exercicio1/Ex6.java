package exercicio1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Exercic�o 6

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os valores dos lados A, B e C respectivamente");
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double areaDoTriangulo;
		double areaDoCirculo;
		double areaDoTrapezio;
		double areaDoQuadrado;
		double areaDoRetangulo;
		double pi = 3.14159;
		
		areaDoTriangulo = (A*C)/2;
		areaDoCirculo = pi*Math.pow(C, 2);
		areaDoTrapezio = (A+B)/2*C;
		areaDoQuadrado = Math.pow(B, 2);
		areaDoRetangulo = A*B;
		
		System.out.printf("A �rea do tri�ngulo ret�ngulo que tem A por base e C por altura : %.3f%n", areaDoTriangulo);
		System.out.printf("A �rea do c�rculo de raio C: %.3f%n", areaDoCirculo);
		System.out.printf("A �rea do trap�zio que tem A e B por bases e C por altura: %.3f%n", areaDoTrapezio);
		System.out.printf("A �rea do quadrado que tem lado B: %.3f%n", areaDoQuadrado);
		System.out.printf("A �rea do ret�ngulo que tem lados A e B: %.3f", areaDoRetangulo);
		
		
		
		
		sc.close();
	}

}
