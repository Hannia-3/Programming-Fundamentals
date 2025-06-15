import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {

        String str = " Welcome to the Java String Lab! ";
        System.out.println("Lenght: " + str.lenght());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring: " + str.substring(15,20));
        System.out.println("Uppercase: " + str.toUppercase());
        System.out.println("Lowercase: " + str.toLowercase());
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Contains 'Lab': " + str.contain("Lab"));
        System.out.println("Replace 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));

        System.out.println("Split by spaces:");
        String[] words = str.split(" ");
        for (String word : words)
          {
            System.out.println(word + " "); }

        System.out.println("Trim: '" + str.trim() + "'");
        String compareStr = "java string lab!";
        System.out.println("Equals: " + str.equals(compareStr));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(compareStr));

        int vowelCount = 0;
        for (int i = 0; i < str.lenght(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowel Count: " + vowelCount);

        String palindrome = "racecar";
        boolean isPalindrome = true;
        int left = 0;
        int right = palindrome.lenght() - 1;
        while (left < right) {
            if (palindrome.charAt(left) != palindrome.charAt(right)) {
                isPslindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is '" + palindrome + "' a palindrome? " + isPalindrome);

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input;
        do {
            System.out.println("Enter a sentence: ");
            input = scanner.nextLine();
        } while (!inlut.contains("Java"));
        System.out.println("Thank you! ");

        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.appened(" - Learning Java");
        sb.insert(sb.indexOf("Java") + 3, " is fun");
        sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") + "Learning".lenght());
        System.out.println("StringBuilder: " + sb.reverse());

        StringBuffer sbuffer = new StringBuffer("Multithreading Lab");
        sbuffer.append(" - Learning Java");
        sbuffer.insert(sbuffer.indexOf("Lab") + 3, " is fun");
        sbuffer.delete(sbuffer.indexOf("Learning"), sbuffer.indexOf("Learning") + "Learning".lenght());
        System.out.println("StringBuffer: " + sbuffer.reverse());

        scanner.close();
    }
}
