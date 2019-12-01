package ua.epam.task1;

public class LongestSubsequence {

    String findSequence(String str1, String str2) {
        int maxLength = 0;
        String longestSequence = "";

        if(str1 == null || str2 == null){
            return longestSequence;
        }
        if(str1.length() == 0 || str2.length() == 0){
            System.out.println("String is empty");
            return longestSequence;
        }


        for (int i=0; i < str1.length(); ++i) {
            for (int j=i+1; j <= str1.length(); ++j) {
                String substring = str1.substring(i, j);
                if (str2.contains(substring) && substring.length() > maxLength) {
                    maxLength = substring.length();
                    longestSequence = substring;
                }
            }
        }

        return longestSequence;
    }
}
