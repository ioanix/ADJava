package com.ch1;

public class Main {

    public static void main(String[] args) {

        printFizzBuzz();
    }

    public static void printFizzBuzz() {

        for (int i = 1; i <= 100; i++) {

            if(i % 15 == 0) {

                System.out.println("FizzBuzz");

            } else if(i % 3 == 0) {

                System.out.println("Fizz");

            } else if(i % 5 == 0) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);
            }

        }
    }
}
