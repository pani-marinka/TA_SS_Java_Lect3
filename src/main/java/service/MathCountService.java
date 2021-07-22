package service;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MathCountService {


    public static void sumNumbers(int n1, int n2) { // sum odd and even numbers
        int sumOdd = 0, sumEven = 0;
        //  sumEven = IntStream.iterate(n1, i -> i + 1).limit(n2).filter(isEven()).peek(MathCountService::printEvenNumber).sum();
        sumEven = IntStream.iterate(n1, i -> i + 1).limit(n2).filter(isEven()).sum();
        sumOdd = IntStream.iterate(n1, i -> i + 1).limit(n2).filter(isOdd()).sum();
        System.out.println("sumEven = " + sumEven);
        System.out.println("sumOdd = " + sumOdd);
    }

//    private static void printEvenNumber(int i) {
//        System.out.println(i + " is an even number");
//    }
//
//    private static void printOddNumber(int i) {
//        System.out.println(i + " is an odd number");
//    }

    private static IntPredicate isEven() {  //Even number&
        return i -> i % 2 == 0;
    }

    private static IntPredicate isOdd() { //Odd numbers?
        return i -> i % 2 == 1;
    }

//Program build Fibonacci numbers: F1 will be the biggest odd number and F2 – the biggest even number, user can enter the size of set (N);
    public static void numberFibonacci(int n2, int n3) {

        int f1 = n2 - 1, f2 = n2, rem = 0;
        if (n2 % 2 != 0) {
            f1 = n2;
            f2 = n2 - 1;
        }
        System.out.print(f1 + "|" + f2 + "|");
        rem = f1 + f2;
        double countOdd = 1, countEven = 1, count = 2;
        while (rem <= n3) {
            System.out.print(rem + "|");
            if (rem % 2 == 0)
                countEven++;
            else
                countOdd++;
            count++;
            f1 = f2;
            f2 = rem;
            rem = f1 + f2;
        }
        System.out.println("% evens = " + (countEven * 100 / count) + ", % odds = " + (countOdd * 100 / count));
    }
}

