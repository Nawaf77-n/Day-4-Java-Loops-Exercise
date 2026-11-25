import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
If the number is a multiple of 5, you need to print "Buzz" instead of that
number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
instead of that number.
         */

        Scanner in = new Scanner(System.in);


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }


        /*
        2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT
         */

        System.out.println("Enter a sentence: ");
        String sentence = in.nextLine();
        String rev ="";

        for (int i = 0; i <= sentence.length() -1; i++ ) {
            rev = sentence.charAt(i) + rev;
        }
        System.out.println(rev);


        /*
        3.Write a program to find the factorial value of any number entered
through the keyboard.
         */

        System.out.println("Enter a number to find its factorial: ");
        int factorial_number = in.nextInt();
        int factorial = 1;

        for(int i = 1; i <= factorial_number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + factorial_number + " is: " + factorial);


        /*
        4.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java
built-in method)
         */

        System.out.println("Enter a number and the power you want of that number: \nThe base: ");
        int num_base = in.nextInt();
        System.out.println("The power: ");
        int num_power = in.nextInt();
        int result = 1;

        for (int i = num_power; i > 0; i--) {
            result *= num_base;
        }
        System.out.println(num_base + " to the power of " + num_power + " is " +  result);


        /*
        5.Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.
         */

        int sum_even_numbers = 0;
        int sum_odd_numbers = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter a number: ");
            int numbers_input = in.nextInt();

            if (numbers_input % 2 == 0) {
                sum_even_numbers += numbers_input;
            }
            else {
                sum_odd_numbers += numbers_input;
            }
        }

        System.out.println("Sum of even integers: " + sum_even_numbers);
        System.out.println("Sum of odd integers: " + sum_odd_numbers);



        /*
        6.Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.
         */

        System.out.println("Enter a positive integer to check if it's a prime number or not: ");
        int num_prime = in.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < num_prime; i++) {
            if (num_prime % i == 0 ) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num_prime + " is a prime number");
        } else {
            System.out.println(num_prime + " is not a prime number");
        }


        /*
        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week.
Expected Output:
Week 1
Day1
Day2
Day3
Day4
Day5
Day6
Day7
Week 2
Day1
Day2
...
         */

        int number_of_weeks = 4;
        int number_of_days = 7;

        for (int i = 1; i <= number_of_weeks; i++) {
            System.out.println("Week " + i);
            for (int d = 1; d <= number_of_days; d++) {
                System.out.println("Day" + d);
            }
        }


        /*
        8.Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.
         */

        System.out.println("Enter a word: ");
        String word1 = in.nextLine();           //dummy
        String word = in.nextLine();

        String reverse_word ="";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse_word = reverse_word + word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse_word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " in not a palindrome");
        }

    }
}