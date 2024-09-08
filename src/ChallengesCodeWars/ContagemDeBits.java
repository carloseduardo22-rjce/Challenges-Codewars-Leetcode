package ChallengesCodeWars;

import java.util.Scanner;

public class ContagemDeBits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int number = sc.nextInt();
		
		int[] bin = new int[30];
		int indice = 0;
		while (number>0) {
			int result = number%2;
			bin[indice] = result;
			number /= 2;
			indice++;
		}
		
		int cont = 0;
		for (Integer n : bin) {
			if (n==1) {
				cont++;
			}
		}
		
		System.out.println("Total de bits: " + cont);
		
	}

}
