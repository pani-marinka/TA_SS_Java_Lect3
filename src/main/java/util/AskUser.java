package util;

import constant.Constants;
import service.PatternService;

import java.util.Scanner;

public class AskUser {
    private static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static String whatUserWants() {
        System.out.println(Constants.WHAT_YOU_WANT);
        return getScanner().nextLine();
    }

    public static String whatUserGet() {
        System.out.println(Constants.WHAT_YOU_GET);
        return getScanner().nextLine();
    }

    public static int whatNumbersF1() {
        System.out.println(Constants.WHAT_NUMBERS_F1);
        return Integer.parseInt(getScanner().nextLine());
    }

    public static int whatNumbersF2() {
        System.out.println(Constants.WHAT_NUMBERS_F2);
        return Integer.parseInt(getScanner().nextLine());
    }

    public static int[] caseChoice(String enterNumbers) {
        int forsel = 0;
        int[] numbers;
        while (forsel == 0) {
            if (enterNumbers != null) {
                numbers = PatternService.matchAskUser(enterNumbers);

                if (PatternService.checkMassive(numbers)) {
                    forsel = 1;
                    System.out.printf("Numbers1: %d  Numbers2: %d \n", numbers[0], numbers[1]);
                    return numbers;
                } else {
                    enterNumbers = AskUser.whatUserWants();
                }
            }

        }

        return new int[2];
    }
}


