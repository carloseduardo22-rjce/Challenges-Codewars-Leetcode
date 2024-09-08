package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> letras = new ArrayList<>();
		
		System.out.println("Digite a string para analisarmos: ");
		String string = sc.nextLine();
		letras.add(string);
		
		List<String> palavraDivida = new ArrayList<>();
		for (String palavra : letras) {
			if (palavra.length()%2 == 0) {
				for (int i=0; i<palavra.length(); i+=2) {
					palavraDivida.add(palavra.substring(i, Math.min(i+2, palavra.length())));
				}
			} else {
				for (int i = 0; i < palavra.length(); i += 2) {
				    int endIndex = Math.min(i + 2, palavra.length());
				    String palavraSplitada = palavra.substring(i, endIndex);
				    if (endIndex == palavra.length()) {
				        palavraSplitada = palavraSplitada + "_";
				    }
				    palavraDivida.add(palavraSplitada);
				}
			}
		}
		
		System.out.println(palavraDivida);

		
	}

}
