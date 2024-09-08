package ChallengesCodeWars;

import java.util.Locale;
import java.util.Scanner;

public class CharForASCII {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		char primeiroCaractere = palavra.charAt(0);
		String palavraModificada = palavra.substring(2, palavra.length() -1);;
		int codigoASCII_letra = Integer.valueOf(primeiroCaractere);		
		String newWord = codigoASCII_letra + palavra.charAt(palavra.length() -1) + palavraModificada + palavra.charAt(1);
		System.out.println(palavra.charAt(palavra.length() -1));
		System.out.println(newWord);
		System.out.println(palavraModificada);
	}

}
