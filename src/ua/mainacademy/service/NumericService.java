package ua.mainacademy.service;

public class NumericService {

    public static int getSumByTypes(int number) {
        int result = 0;
        String str = Integer.toString(number);
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            result = result + Character.getNumericValue(charArray[i]);
        }

        return result;
    }

    public static int getSumByMath(int number) {
        int result = 0;

        for (; number != 0; number = number / 10) {
            result = result + number % 10;
        }

        return result;
    }
}