package ChallengesCodeWars;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConteCaracteresNaSuaString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String word = sc.nextLine();
		
		Map<Character, Integer> letters = new HashMap<>();
		for (int i=0; i<word.length(); i++) {
			char currentChar = word.charAt(i);
			
			if (letters.containsKey(currentChar)) {
				letters.put(currentChar, letters.get(currentChar) + 1);
			} else {
				letters.put(currentChar, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
			System.out.println("Key:" + entry.getKey() + " Quantity: " + entry.getValue());
		}
		
	}

}
