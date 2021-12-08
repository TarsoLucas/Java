package ExercicioszFor;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um inteiro qualquer.");
		
		int n = sc.nextInt();
		int nIn = 0;
		int nOut = 0;
		
		for(int i=1;i<=n;i++) {
			System.out.println("Digite o "+i+ "º número");
			double x = sc.nextDouble();
			
			if (x>=10 && x<=20) {
				nIn++;
			}
			else
				nOut++;
		}
		
		System.out.println(nIn+" in");	
		System.out.println(nOut+" out");
		
		
		sc.close();
	}

}
