package service;

import util.AskUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternService {
    public static int[] matchAskUser(String inputUser) {
        int[] numbers = new int[2];
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputUser);
        int start = 0, i = 0;
        while (matcher.find(start)) {
            String value = inputUser.substring(matcher.start(), matcher.end());
            if (i == 1) numbers[1] = Integer.parseInt(value);
            if (start == 0) {
                numbers[0] = Integer.parseInt(value);
                i++;
            }
            start = matcher.end();
        }
        return numbers;
    }

    public static boolean checkMassive(int[] numbers) {
        if (numbers.length > 1) {
            if (numbers[0] < numbers[1]) return true;
        }
        return false;
    }

}
