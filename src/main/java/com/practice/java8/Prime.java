package com.practice.java8;

import java.util.stream.IntStream;

import static java.lang.System.exit;

public class Prime {
    public static void main(String[] args) {
        isPrime(10);
        isPrime(0);
        isPrime(-1);
        isPrime(11);
        isPrime(13);
    }

    private static void isPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime number");
            return;
        }


        boolean isPrime = IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(x -> num % x == 0);

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }


    }
}
