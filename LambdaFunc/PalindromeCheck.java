//Write a Java program to check if a string is a palindrome using lambda expressions.
package LambdaFunc;

import java.util.function.Predicate;

public class PalindromeCheck {
    public static void main(String[] args) {
        Predicate<String> isPalindrome = s -> s.equals(new StringBuilder(s).reverse().toString());
        System.out.println(isPalindrome.test("aba")); // Output: true
        System.out.println(isPalindrome.test("hello")); // Output: false
    }
}

//A Predicate is a functional interface in Java that represents a single argument function that returns a boolean value. It is commonly used in scenarios where we need to evaluate a condition on an input and return either true or false. The Predicate interface has a single abstract method test(T t).