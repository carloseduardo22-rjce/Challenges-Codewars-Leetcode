package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class perímetoDeQuadrados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> perimetersOfSquare = new ArrayList<>(Arrays.asList(1,1,2,3,5,8));
		System.out.println("Digite o perímetro: ");
		int perimeter = sc.nextInt() + 1;
		
		int sum = 0;
		for (int i=0; i<perimeter; i++) {
			sum += perimetersOfSquare.get(i);
		}
		
		int result = 4 * sum;
		System.out.println("Sum: " + result);
		
	}

}
