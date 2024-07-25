public class StringUtils {
    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);
    }

    // Method to count the number of vowels in a string
    public int countVowels(String str) {
        if (str == null) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiou";
        for (char c : str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Method to reverse a string
    public String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
