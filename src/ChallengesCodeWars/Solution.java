package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3};
		int target_number = 4;
		List<Integer> indexes = twoSum(numbers, target_number);
		System.out.println(indexes);
		
	}

	private static List<Integer> twoSum(int[] numbers, int target_number) {
		
		List<Integer> positions = new ArrayList<>();
		for (int i=0; i<numbers.length; i++) {
			int complement = target_number - numbers[i];
			
			for (int j=0; i<numbers.length; i++) {
				if(numbers[j] == complement) {
					positions.add(i, j);
				}
			}
		}
		
		return positions;
		
	}

}
