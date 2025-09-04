package com.practice.java8;

public class FindArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Is Armstrong Number 371 : " + isArmstrongNumberByJava8(371));
    }
    private static boolean isArmstrongNumberByJava8(int num) {
        if (num < 0) {
            return false;
        }
        int numDigits = String.valueOf(num).length();

        int sum = String.valueOf(num).chars().map(Character::getNumericValue)
                .map(digit -> (int) Math.pow(digit, numDigits)).sum();

        return sum==num;
    }
}
