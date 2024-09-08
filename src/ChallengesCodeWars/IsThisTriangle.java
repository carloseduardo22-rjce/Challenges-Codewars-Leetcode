package ChallengesCodeWars;

import java.util.Locale;
import java.util.Scanner;

public class IsThisTriangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side a: ");
		Double a = sc.nextDouble();
		System.out.println("Enter the side b: ");
		Double b = sc.nextDouble();
		System.out.println("Enter the side c: ");
		Double c = sc.nextDouble();
		
		if ((a + c) > b && (a + b) > c && (c + b) > a) {
			System.out.println("É um triângulo!");
		} else {
			System.out.println("Não é um triângulo!");
		}
		
	}

}
