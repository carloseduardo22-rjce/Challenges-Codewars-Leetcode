package ChallengesCodeWars;

import java.util.Scanner;

public class StringInvertida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String word = sc.nextLine();
		
		String stringInvertida = "";
		for (int i= word.length()-1; i>=0; i--) {
			stringInvertida += word.charAt(i);
		}
		
		System.out.println(stringInvertida);
		
	}

}
