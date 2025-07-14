package Strings;

public class MergeStrings {
    /**
     * Merges two strings alternately.
     * 
     * This method takes two strings as input and merges them by alternating characters
     * from each string. If one string is longer than the other, the remaining characters
     * from the longer string are appended at the end.
     * 
     * @param word1 the first string to merge
     * @param word2 the second string to merge
     * @return the merged string
     */
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                merged.append(word2.charAt(j++));
            }
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "defgh";
        System.out.println(mergeAlternately(word1, word2));
    }
}