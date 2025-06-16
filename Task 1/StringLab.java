public class StringLab {
    public static void main(String[] args) {
        String text = " Welcome to the Java String Lab! ";

        System.out.println("Original string: \"" + text + "\"");

        
        System.out.println("1. Length: " + text.length());

        
        System.out.println("2. Character at index 7: '" + text.charAt(7) + "'");

        
        int startIndex = text.indexOf("Java");
        int endIndex = startIndex + "Java".length();
        String javaWord = text.substring(startIndex, endIndex);
        System.out.println("3. Substring (\"Java\"): " + javaWord);

        
        System.out.println("4. Uppercase: " + text.toUpperCase());
        System.out.println("5. Lowercase: " + text.toLowerCase());

        
        System.out.println("6. Index of \"Java\": " + text.indexOf("Java"));

        
        System.out.println("7. Contains \"Lab\": " + text.contains("Lab"));

        
        System.out.println("8. Replace \"Java\" with \"Java Programming\": " +
                text.replace("Java", "Java Programming"));

        
        System.out.println("9. Split by space:");
        String[] words = text.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(" - " + word);
            }
        }

        
        String trimmed = text.trim();
        System.out.println("10. Trimmed string: \"" + trimmed + "\"");

        
        String compareTo = "java string lab!";
        System.out.println("11. Equals: " + trimmed.equals(compareTo));
        System.out.println("12. Equals Ignore Case: " + trimmed.equalsIgnoreCase(compareTo));
    }
}

