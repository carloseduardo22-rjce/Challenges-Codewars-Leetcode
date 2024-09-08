package ChallengesCodeWars;

import java.util.Scanner;

public class SequênciaTribonnaci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10]; 
		int indice = 0;
		while (indice < numbers.length) {
			
			if (indice < 3) {
				System.out.println("Digite os números da sequência: ");
				int number = sc.nextInt();
				numbers[indice] = number;
			} else {
				numbers[indice] = numbers[indice - 1] + numbers[indice - 2] + numbers[indice - 3];
			}
			
			indice++;
			
			if (indice == 10) {
				break;
			}
			
		}
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

}
