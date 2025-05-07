package problem6;

public class StringFinder {

    // Method to count vowels in a string
    public static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : word.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // Method to find the word with the most vowels by using the countVowel function
    public static String findMaxVowelWord(String[] words) {
        if (words == null || words.length == 0)
            return null;

        String result = words[0];
        int maxCount = countVowels(result);

        // Loop through remaining words to find the one with most vowels
        // we will return that
        for (int i = 1; i < words.length; i++) {
            int currentCount = countVowels(words[i]);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                result = words[i];
            }
        }

        return result;
    }

    // Main method to run the program
    public static void main(String[] args) {
        String[] words = { "Sunshine", "Umbrella", "Major", "Resourceful" };
        String wordWithMostVowels = findMaxVowelWord(words);
        System.out.println("Word with most vowels: " + wordWithMostVowels);
    }
}
