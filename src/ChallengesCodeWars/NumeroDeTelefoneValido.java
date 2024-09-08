package ChallengesCodeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroDeTelefoneValido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de telefone: ");
        String phoneNumber = sc.nextLine();
        System.out.println(validPhoneNumber(phoneNumber));
    }

    public static boolean validPhoneNumber(String phoneNumber) {

        if (!phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")) {
            return false;
        }

        phoneNumber = phoneNumber.replaceAll("[^0-9]", "");

        if (phoneNumber.length() < 2) {
            return false;
        }

        int[] numbers = new int[phoneNumber.length()];
        for (int i=0; i < phoneNumber.length(); i++) {
            char character = phoneNumber.charAt(i);
            numbers[i] = Integer.parseInt(String.valueOf(character));
        }

        numbers = quicksort(numbers);

        boolean result = true;
        for (int i=0; i < numbers.length -1; i++) {
            if (numbers[i] > numbers[i+1]) {
                result = false;
            }
        }

        return result;

    }

    private static int[] quicksort(int[] numbers) {
        if (numbers.length < 2) {
            return numbers;
        } else {
            int pivo = numbers[0];
            List<Integer> maioresList = new ArrayList<>();
            List<Integer> menoresList = new ArrayList<>();

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > pivo) {
                    maioresList.add(numbers[i]);
                } else {
                    menoresList.add(numbers[i]);
                }
            }

            int[] menores = listToArray(menoresList);
            int[] maiores = listToArray(maioresList);

            menores = quicksort(menores);
            maiores = quicksort(maiores);

            int[] sorted = concatArrays(menores, pivo, maiores);

            return sorted;
        }
    }

    private static int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private static int[] concatArrays(int[] menores, int pivo, int[] maiores) {
        int[] sorted = new int[menores.length + 1 + maiores.length];
        System.arraycopy(menores, 0, sorted, 0, menores.length);
        sorted[menores.length] = pivo;
        System.arraycopy(maiores, 0, sorted, menores.length + 1, maiores.length);
        return sorted;
    }

}
