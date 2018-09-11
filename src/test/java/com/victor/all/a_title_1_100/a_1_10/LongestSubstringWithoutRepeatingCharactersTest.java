package com.victor.all.a_title_1_100.a_1_10;

import com.victor.all.a_title_1_100.a_1_10.LongestSubstringWithoutRepeatingCharacters;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "au";

        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }
}