package ua.mainacademy;

import ua.mainacademy.service.NumericService;

public class TestService {
    public static void main(String[] args) {

        int number = 12345;

        int result1 = NumericService.getSumByTypes(number);
        int result2 = NumericService.getSumByMath(number);

        System.out.println("Number : " + number);
        System.out.println("Sum number by types method = " + result1);
        System.out.println("Sum number by math method  = " + result2);
    }
}