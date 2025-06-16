import java.util.Scanner;

public class StringLoops {
    public static void main(String[] args) {
        String text = " Welcome to the Java String Lab! ";

        
        int vowels = 0;
        String lowerText = text.toLowerCase();
        for (int i = 0; i < lowerText.length(); i++) {
            char c = lowerText.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            }
        }
        System.out.println("Number of vowels: " + vowels);

        
        String word = "racecar";
        int left = 0;
        int right = word.length() - 1;
        boolean palindrome = true;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("\"" + word + "\" is " + (palindrome ? "" : "not ") + "a palindrome.");

        
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a sentence that contains the word \"Java\": ");
            input = scanner.nextLine();
        } while (!input.contains("Java"));
        System.out.println("Thank you!");
        scanner.close();
    }
}
