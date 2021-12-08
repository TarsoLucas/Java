package ExerciciosWhile;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 -Para registrar Àlcool, 2 -Para registrar Gasolina, 3 - Para registrar Diesel.");
		
		int x=0;
		
		int alc = 0;
		int gas = 0;
		int die = 0;
		
		x = sc.nextInt();
		
		while (x!=4)
		
			if (x==1) {
				alc++;
				x = sc.nextInt();
			}	
			else if (x==2) {
				gas++;
				x = sc.nextInt();
			}	
			else if (x==3) {
				die++;
				x = sc.nextInt();
			}
			else if (x<1 || x>4) {
				 System.out.println("Número inválido");
				x = sc.nextInt();
			}
		 
		 if (x==4) {
				System.out.println("Valeu");
				System.out.println("Àlcool: "+alc);
				System.out.println("Gasolina: "+gas);
				System.out.println("Diesel: "+die);
		 }
		 
		sc.close();
		
		
	}

}
