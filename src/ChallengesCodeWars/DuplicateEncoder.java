package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DuplicateEncoder {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<String> convertido = new ArrayList<>();
		System.out.println("Write a word: ");
		String word = sc.nextLine();
		word.toLowerCase();
		
		String kkk = "";
		for (int i=0; i<word.length(); i++) {
			if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
				kkk += "(";
			}
			else {
				kkk += ")";
			}
		}
		
		System.out.println(kkk);
		
		
	}

}
