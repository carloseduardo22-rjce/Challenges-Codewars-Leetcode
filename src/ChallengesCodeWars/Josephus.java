package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Josephus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// um array com valores e aplicar o algoritmo de Josephus
		// o algoritmo de josephus funciona assim:
		// recebe um valor de intervalo tipo k= [3]
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println("Entre com o valor de intervalo: ");
		int interval = sc.nextInt();
		System.out.println(josephusPermutation(numbers, interval));
		
	}
	
	public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
		// o valor inicial (posição incial será 1 e ai vou contando a partir dessa posição 3)
		// no indíce que parar, tenho que remover o valor, depois que remover o valor
		// tenho que continuar no sucesso dele a contagem, e assim a diante, quando não tiver sucessor
		// vou ter que contar de frente para trás
		List<T> result = new ArrayList();
		int index = 0;
		
		while(!items.isEmpty()) {
			index = (index + k - 1) % items.size();
			result.add(items.remove(index));
		}
		
		return result;
		
	}
	
	

}
