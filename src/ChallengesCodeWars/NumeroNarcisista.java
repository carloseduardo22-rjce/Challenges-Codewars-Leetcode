package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroNarcisista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		Integer number = sc.nextInt();
		String numberString = number.toString();
		int tamanho = Integer.toString(number).length();
		
		ArrayList<Integer> numerosElevados = new ArrayList<>();
		for (int i=0; i<tamanho; i++) {
			char c = numberString.charAt(i);
			int numeroElevado = (int) Math.pow(Character.getNumericValue(c), tamanho);
			numerosElevados.add(numeroElevado);
		}
		
		int soma = 0;
		for (Integer n : numerosElevados) {
			soma += n;
		}
		
		if (soma == number) {
			System.out.println("É um número narcisista!");
		}
		
	}

}
