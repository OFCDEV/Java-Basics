package LambdaFunc;

//Reverse a String Question: Write a Java program to reverse a string using lambda expressions.

//import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = input.chars()
                               .mapToObj(c -> (char) c)
                               .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
        System.out.println(reversed); // Output: "olleh"
    }
}
