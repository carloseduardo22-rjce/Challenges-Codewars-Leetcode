package ChallengesCodeWars;

import java.util.Scanner;

public class ConvertStringToCamelCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println(toCamelCase(frase));
    }

    public static String toCamelCase(String str) {
        boolean capitalizeNext = false;
        StringBuilder camelCaseString = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '-' || c == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    camelCaseString.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    camelCaseString.append(c);
                }
            }
        }

        return camelCaseString.toString();
    }
}
