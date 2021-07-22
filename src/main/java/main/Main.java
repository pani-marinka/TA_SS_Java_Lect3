package main;

import service.MathCountService;
import util.AskUser;

public class Main {
    public static void main(String[] args) {
        String enterNumbers;
        int forsel = 0;    //для case
        int[] numbers = new int[2];

        enterNumbers = AskUser.whatUserWants();


        numbers = AskUser.caseChoice(enterNumbers);


        forsel = 0;
        String userDecision = AskUser.whatUserGet();

        do {
            switch (userDecision) {
                case "1":
                    MathCountService.sumNumbers(numbers[0], numbers[1]);
                    enterNumbers = AskUser.whatUserWants();
                    numbers = AskUser.caseChoice(enterNumbers);
                    userDecision = AskUser.whatUserGet();
                    break;
                case "2":
                    MathCountService.numberFibonacci(numbers[0], numbers[1]);
                    enterNumbers = AskUser.whatUserWants();
                    numbers = AskUser.caseChoice(enterNumbers);
                    userDecision = AskUser.whatUserGet();
                    break;
                case "e":
                    System.exit(0);
                default:
                    enterNumbers = AskUser.whatUserWants();
                    numbers = AskUser.caseChoice(enterNumbers);
                    userDecision = AskUser.whatUserGet();
                    break;
            }

        } while (forsel == 0);

    }
}
