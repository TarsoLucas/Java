package exercicio1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		//Exerc�cio 5

		Scanner sc = new Scanner (System.in);
		
		int peca1;
		int peca2;
		int quantidade;
		int quantidade2;
		double valorUnitario;
		double valorUnitario2;
		double total;
		
		System.out.println("Digite na mesma linha o c�digo da pe�a, a quantidade e o valor unit�rio, para as duas pe�as:");
		
		peca1 = sc.nextInt();
		quantidade = sc.nextInt();
		valorUnitario = sc.nextDouble();
		
		peca2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		
		total = (quantidade*valorUnitario)+(quantidade2*valorUnitario2);
		
		System.out.println("C�digo das pe�as: " + peca1 + ", "+ peca2);
		System.out.printf("Total a pagar: %.2f" , total );
		
		sc.close();
		
	}

}
