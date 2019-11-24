package ua.epam.Task1;

public class AppStart {
    public static void main(String[] args) {
        LongestSubsequence longestSubsequence = new LongestSubsequence();
        String str1 = "helloworldhello";
        String str2 = "myworld";
        System.out.println(longestSubsequence.findSequence(str1, str2));
    }
}
