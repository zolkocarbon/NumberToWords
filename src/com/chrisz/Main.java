package com.chrisz;

public class Main {

    public static void main(String[] args) {
       // System.out.println(getDigitCount(200));
       // System.out.println(reverse(-200));
        numberToWords(2500);
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int i = reverse(number);

        int digit = 0;
        do {
            digit = i % 10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                   break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            i /= 10;
        } while (i != 0);

        // reversing 200 will yield 2 so we need to count the difference in digits and print out zero
        // for every count
        if(getDigitCount(reverse(number)) != getDigitCount(number)) {
            int repeat = getDigitCount(number) - getDigitCount(reverse(number));
            for(int j=0; j < repeat; j++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        int count = 0;
        do { // using this works for 0 also
            count++;
            number /= 10;
        } while(number != 0);
        return count;
    }
}
