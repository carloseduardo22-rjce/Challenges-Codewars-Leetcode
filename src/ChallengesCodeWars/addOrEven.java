package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class addOrEven {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> inteiros = new ArrayList<>();
		
		while (true) {
			System.out.println("Digite um número para adicionarmos no array: ");
			Integer number = sc.nextInt();
			inteiros.add(number);
			sc.nextLine();
			
			System.out.println("Deseja continuar? (Sim/Nao)");
			String resposta = sc.nextLine();
			if (resposta.equalsIgnoreCase("NAO")) {
				break;
			}
		}
		
		Integer soma = 0;
		for (Integer number : inteiros) {
			soma += number;
		}
		
		System.out.println(soma);
		
	}

}
