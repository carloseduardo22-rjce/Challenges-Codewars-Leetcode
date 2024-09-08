package ChallengesCodeWars;

import java.util.Scanner;

public class SumStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira String a ser somada: ");
		String firstString = sc.nextLine();
		System.out.println("Digite a segunda String a ser somada: ");
		String secondString = sc.nextLine();
		System.out.println(sumStrings(firstString, secondString));
		
	}
	
	public static String sumStrings(String a, String b) {
	    // eu tenho que converter essas strings para inteiro, depois somar cada número
		// depois de somado eu retorno ela em String
		Integer firstNumber = Integer.valueOf(a);
		Integer secondNumber = Integer.valueOf(b);
		Integer sum = firstNumber + secondNumber;
		return sum.toString();
	}

}
