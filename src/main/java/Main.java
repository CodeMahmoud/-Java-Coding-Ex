import java.util.Scanner;

public class Main {


public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter sentence");
    String input = scanner.nextLine();
    int result = Words.wordCount(input);
    String palindromeResult = Palindrome.palindromeCheck(input);
    String vowelsResult = VowelsCounter.vowelsCounter(input);
    System.out.println(vowelsResult);
    System.out.println("The number of words in the sentence is " + result);
    System.out.println(palindromeResult);
}

}
