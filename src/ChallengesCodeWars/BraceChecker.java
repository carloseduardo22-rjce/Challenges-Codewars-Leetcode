package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.Scanner;

public class BraceChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sequência de colchetes: ");
		String colchetes = sc.nextLine();
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		int balance = 0;
		for (int i=0; i<colchetes.length(); i++) {
			char c = colchetes.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				balance++;
			} 
			if (c == ')' || c == '}' || c == ']') {
				balance--;
			}
		}
		
		boolean result = false;
		if (balance == 0) {
			result = true;
		} 
	
		System.out.println(result);
		
	}

}
