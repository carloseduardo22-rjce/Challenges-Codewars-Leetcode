package ChallengesCodeWars;

import java.util.Scanner;

public class CodificadorAlgarismosRomanos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o número: ");
		int number = sc.nextInt();
		
		String romanNumeral = converterParaRomando(number);
		System.out.println(romanNumeral);
		
	}

	private static String converterParaRomando(int number) {
		String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		StringBuilder resultado = new StringBuilder();
		int indice = 0;
		
		while (number > 0) {
			int divisor = number/valores[indice];
			number %= valores[indice];
			resultado.append(simbolos[indice].repeat(divisor));
			indice++;
		}
		
		return resultado.toString();
		
	}

}
