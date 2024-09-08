package ChallengesCodeWars;

import java.util.Scanner;

public class RestoCalculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreve um número: ");
		int number = sc.nextInt();
		
		int resto = number%2;
		
		System.out.println(resto);

	}

}
