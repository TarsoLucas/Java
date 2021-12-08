package ExerciciosWhile;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite as coordenadas X e Y em sequência:");
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();		
		
		while (x!=0 && y!=0)
			if (x>0 && y>0) {
				System.out.println("1°Q");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}	
			else if (x>0 && y<0) {
				System.out.println("4ºQ");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}
			else if (x<0 && y>0) {
				System.out.println("2°Q");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}
			else {
				System.out.println("3°Q");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}
		
		System.out.println("Deletando System32.");
		
		
		
		sc.close();
		
	}

}
