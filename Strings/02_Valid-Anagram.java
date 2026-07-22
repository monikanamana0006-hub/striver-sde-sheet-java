//brute force
public class Solution {

    // Function to check if two strings are anagrams
    public static boolean CheckAnagrams(String str1, String str2) {
        // Case 1: when both of the strings have different lengths
        if (str1.length() != str2.length()) {
            return false;  // Strings can't be anagrams if lengths are different
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Case 2: check if every character of str1 and str2 matches with each other
        for (int i = 0; i < str1.length(); i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;  // If any character doesn't match, they aren't anagrams
            }
        }

        return true;  // Strings are anagrams
    }
