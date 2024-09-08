package ChallengesCodeWars;

import java.util.*;

public class ProximoNumeroMaiorComOsMesmosDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Long number = sc.nextLong();
        System.out.print(nextBiggerNumber(number));

    }

    private static Long nextBiggerNumber(Long number) {
        String numberStr = Long.toString(number);
        Character[] digits = new Character[numberStr.length()];
        for (int i=0; i < digits.length; i++) {
            digits[i] = numberStr.charAt(i);
        }
        Arrays.sort(digits, Collections.reverseOrder());
        StringBuilder sorterdNumber = new StringBuilder(digits.length);
        for (Character character : digits) {
            sorterdNumber.append(character);
        }
        return Long.parseLong(String.valueOf(sorterdNumber));
    }

}
