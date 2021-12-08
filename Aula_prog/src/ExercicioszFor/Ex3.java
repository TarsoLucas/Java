package ExercicioszFor;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o número de unidades.");
		
		int N = sc.nextInt();
		double n1 = 0;
		double n2 = 0;	
		double n3 = 0;
		double m;
		
		for (int i=1; i<=N; i++) {
			
			System.out.println("Digite as notas da unidade " + i);
		
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			m = (n1*2 + n2*3 + n3*5)/10; 
			
			System.out.printf("Média da %d unidade: %.1f%n", i, m);
			System.out.println();
		}	
		
		
		sc.close();

	}

}
