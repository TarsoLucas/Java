package exerciciosCondicional;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Exercício 4
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os horários de início e fim para saber a duração do jogo:");
		
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		int duracao = (24-hi+hf);
		int duracao2 = Math.abs(hi-hf);
		
		if(hi<hf)
			 System.out.println("A duração do jogo foi de: " + duracao2 +"h");
		
		else if(duracao>24)
			System.out.println("O jogo não existe");
		
		else if(duracao==24)
			System.out.println("A duração do jogo foi de: " + duracao + "h");
		
		else if(hi>hf)
			System.out.println("A duração do jogo foi de: " + duracao + "h");
		
		else if (duracao<1)
			System.out.println("O jogo não existe");
		
		sc.close();

	}

}
