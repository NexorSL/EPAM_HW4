package ua.epam.Task1;

import org.junit.Test;
import static org.junit.Assert.*;
public class LongestSubsequenceTest {

    @Test
    public void testFindSequence_ok(){
        LongestSubsequence longestSubsequence = new LongestSubsequence();
        String str1 = "myWorld";
        String str2 = "AnotherWorldworld";
        String result = longestSubsequence.findSequence(str1, str2);
        assertEquals(result, "World");
    }
    @Test
    public void testFindSequence_fail(){
        LongestSubsequence longestSubsequence = new LongestSubsequence();
        String str1 = "myWorld";
        String str2 = "AnotherWorldworld";
        String result = longestSubsequence.findSequence(str1, str2);
        assertEquals(result, "world");
    }
}
