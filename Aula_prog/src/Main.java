import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int idade = 32;
		int code = 2479;
		char gender = 'F';
		
		double value1 = 2100.00;
		double value2 = 650.00;
		double measure = 53.1235;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n ", product1, value1);
		System.out.printf("%s, which price is $ %.2f%n ", product2, value2);
		
		System.out.println();
		
		System.out.println("Record:" + idade + " years old, code " + code + " and gender: " + gender);
		
		System.out.println();
		
		System.out.printf("Measurement with eight decimal places: %.8f%n" , measure );
		System.out.printf("Rounded: %.2f%n", measure);
		


	}

}
