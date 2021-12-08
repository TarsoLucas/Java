package ExerciciosWhile;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha:");
		
		int x = sc.nextInt();
		
		while (x!=2002) {
			System.out.println("Senha inválida, tente novamente:");
			x = sc.nextInt();
		}
		System.out.println("Acesso concedido.");
		
		
		
		sc.close();
		
		
		
	}

}
