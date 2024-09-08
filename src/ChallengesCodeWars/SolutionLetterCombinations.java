package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SolutionLetterCombinations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite os digitos: ");
		String digits = sc.nextLine();
		System.out.print(letterCombinations(digits));
		
	}
	
	public static List<String> letterCombinations(String digits) {
		String[][] botoesDeTelefone = {
			{""}, {""}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}, 
			{"m", "n", "o"}, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}
		};
		List<String> result = new ArrayList<>();
		if (digits == null | digits.isEmpty()) {
			return result;
		}
		
		letterCombinationsHelper(digits, 0, "", botoesDeTelefone, result);
		return result;
		
	}

	private static void letterCombinationsHelper(String digits, int index, String current, String[][] botoesDeTelefone,
			List<String> result) {
		if (index == digits.length()) {
			result.add(current);
			return;
		}
		
		int digit = digits.charAt(index) - '0';
		for (String letter : botoesDeTelefone[digit]) {
			letterCombinationsHelper(digits, index + 1, current + letter, botoesDeTelefone, result);
		}
		
	}

}
