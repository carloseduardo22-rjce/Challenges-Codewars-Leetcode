package ChallengesCodeWars;

import java.util.Scanner;

public class HumanReadableTime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um número inteiro não negativo: ");
		int number = sc.nextInt();
		System.out.println(makeReadable(number));

	}
	
	public static String makeReadable(int seconds) {
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		int remaingSeconds = seconds % 60;
		
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

}
