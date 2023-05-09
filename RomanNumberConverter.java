package bg.jug.academy;

import java.util.HashMap;
import java.util.Map;

 class RomanNumberConverter {
    private static final Map<Character, Integer> ROMAN_NUMERAL_MAP = new HashMap<>();

    static {
        ROMAN_NUMERAL_MAP.put('I', 1);
        ROMAN_NUMERAL_MAP.put('V', 5);
        ROMAN_NUMERAL_MAP.put('X', 10);
        ROMAN_NUMERAL_MAP.put('L', 50);
        ROMAN_NUMERAL_MAP.put('C', 100);
        ROMAN_NUMERAL_MAP.put('D', 500);
        ROMAN_NUMERAL_MAP.put('M', 1000);
    }

    public static String toRomanNumeral(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        }

        StringBuilder sb = new StringBuilder();
        int[] digits = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < digits.length; i++) {
            while (number >= digits[i]) {
                sb.append(numerals[i]);
                number -= digits[i];
            }
        }
        return sb.toString();
    }

    public static int toInteger(String romanNumeral) {
        int result = 0;
        int previousValue = 0;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = ROMAN_NUMERAL_MAP.get(romanNumeral.charAt(i));
            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }


}
class Main {

    public static void main(String[] args) {
        int number = 1984;
        String romanNumeral = RomanNumberConverter.toRomanNumeral(number);
        System.out.println(number + " -> " + romanNumeral);

        String input = "MCMXCIV";
        int result = RomanNumberConverter.toInteger(input);
        System.out.println(input + " -> " + result);
    }

}