//Write a Java program to concatenate a list of strings using lambda expressions and the reduce method.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "!");
        String result = strings.stream().reduce("", String::concat); //Here we use the default concant method of String class
        System.out.println(result); // Output: HelloWorld!
    }
}

