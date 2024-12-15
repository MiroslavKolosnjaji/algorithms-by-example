package com.myproject.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class StringUtilsTest {
    
    @DisplayName("String - find vowels")
    @Test
    void testFindVowels_whenStringIsPopulated_returnsNumberOfVowels() {

        String sentence = "Man is not worried by real problems so much as by his imagined anxieties about real problems. -Epictetus";
        int expectedNumber = 34;

        int result = StringUtils.findVowels(sentence);

        assertEquals(expectedNumber, result, "Result doesn't match expected number of vowels.");
    }

    @DisplayName("String - find vowels - when string is null")
    @Test
    void testFindVowels_whenStringIsNull_returnsZero() {

        int result = StringUtils.findVowels(null);

        assertEquals(0, result, "Result should be zero.");
    }

    @DisplayName("String - reverse")
    @Test
    void testReverse_whenStringIsPopulated_returnsReversedString() {

        String sentence = "John Lennon";
        String expectedString = "nonneL nhoJ";

        String result = StringUtils.reverse(sentence);

        assertEquals(expectedString, result, "Result doesn't match expected string.");
    }

    @DisplayName("String - reverse - when string is null")
    @Test
    void testReverse_whenStringIsNull_returnsEmptyString() {

        String result = StringUtils.reverse(null);
        assertEquals("", result, "Result should be empty string.");
    }

    @DisplayName("String - reverse words")
    @Test
    void testReverseWords_whenStringIsPopulated_returnsReversedWords() {

        String sentence = "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. – Buddha";
        String expectedResult = "Buddha – moment. present the on mind the concentrate future, the of dream not do past, the in dwell not Do";

        String result = StringUtils.reverseWords(sentence);

        assertEquals(expectedResult, result, "Result doesn't match expected string.");
    }


    @DisplayName("String - reverse words - when string is null")
    @Test
    void testReverseWords_whenStringIsNull_returnsEmptyString() {

        String result = StringUtils.reverseWords(null);

        assertEquals("",result, "Result should be empty string.");
    }

    @DisplayName("String rotation")
    @Test
    void testIsRotation_whenTwoStringAreRotation_returnsTrue() {

        String s1 = "abc";
        String s2 = "bca";

        boolean isRotation = StringUtils.isRotation(s1, s2);

        assertTrue(isRotation, "Method should return true.");
    }

    @DisplayName("String rotation - is no rotation")
    @Test
    void testIsRotation_whenTwoStringAreNotRotation_returnsFalse() {

        String s1 = "abc";
        String s2 = "def";

        boolean isRotation = StringUtils.isRotation(s1, s2);

        assertFalse(isRotation, "Method should return false.");
    }

    @DisplayName("String - remove duplicates")
    @Test
    void testRemoveDuplicates_whenStringIsPopulated_returnsStringWithNoDuplicateCharacters(){

        String input = "abbcccddddeeeee";
        String expectedResult = "abcde";

        String result = StringUtils.removeDuplicates(input);

        assertEquals(expectedResult, result, "Result doesn't match expected string.");
    }

    @DisplayName("String - remove duplicates - when string is null")
    @Test
    void testRemoveDuplicates_whenStringIsNull_returnsEmptyString() {

        String result = StringUtils.removeDuplicates(null);

        assertEquals("", result, "Result should be empty string.");
    }

    @DisplayName("String - most repeated char")
    @Test
    void testMostRepeatedChar_whenStringIsPopulated_returnsMostRepeatedCharacter() {

        String sentence = "The only true wisdom is in knowing you know nothing.– Socrates";
        Character expectedCharacter = 'n';

        Character result = StringUtils.mostRepeatedChar(sentence);

        assertEquals(expectedCharacter, result, "Result doesn't match expected character.");
    }

    @DisplayName("String - most repeated char - empty string")
    @Test
    void testMostRepeatedChar_whenStringIsEmpty_throwsIllegalArgumentException() {

        Executable executable = () -> StringUtils.mostRepeatedChar("");

        assertThrows(IllegalArgumentException.class, executable, "Expected IllegalArgumentException.");
    }

    @DisplayName("String - capitalize first letter")
    @Test
    void testCapitalizeFirstLetter_whenStringIsPopulated_returnsWordsWithFirstLetterCapitalized() {

        String input = "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill";
        String expectedResult = "Success Is Not Final, Failure Is Not Fatal: It Is The Courage To Continue That Counts. – Winston Churchill";

        String result = StringUtils.capitalizeFirstLetter(input);

        assertEquals(expectedResult, result, "Result doesn't match expected string.");

    }

    @DisplayName("String - capitalize first letter - when string is null")
    @Test
    void testCapitalizeFirstLetter_whenStringIsNull_returnsEmptyString() {

        String result = StringUtils.capitalizeFirstLetter(null);

        assertEquals("", result, "Result should be empty string.");
    }

    @DisplayName("String - is anagram")
    @Test
    void testIsAnagram_whenStringsAreAnagrams_returnsTrue() {

        String s1 = "Listen";
        String s2 = "Silent";

        boolean isAnagram = StringUtils.isAnagram(s1, s2);

        assertTrue(isAnagram, "Method should return true.");
    }

    @DisplayName("String - is anagram - not anagrams")
    @Test
    void testIsAnagram_whenStringsAreNotAnagrams_returnFalse() {

        String s1 = "Listen";
        String s2 = "Silnent";

        boolean isAnagram = StringUtils.isAnagram(s1, s2);

        assertFalse(isAnagram, "Method should return false.");
    }

    @DisplayName("String - is palindrome")
    @Test
    void testIsPalindrome_whenStringIsPalindrome_returnsTrue() {

        String input = "wasitacaroracatisaw";

        boolean isPalindrome = StringUtils.isPalindrome(input);

        assertTrue(isPalindrome, "Method should return true.");
    }

    @DisplayName("String - is palindrome - when string is empty")
    @Test
    void testIsPalindrome_whenStringIsEmpty_returnsTrue() {

        String input = "";

        boolean isPalindrome = StringUtils.isPalindrome(input);

        assertFalse(isPalindrome, "Method should return false.");
    }

    @DisplayName("String - are anagrams")
    @Test
    void testAreAnagrams_whenStringsAreAnagrams_returnsTrue() {

        String s1 = "stressed";
        String s2 = "desserts";

        boolean areAnagrams = StringUtils.areAnagrams(s1, s2);

        assertTrue(areAnagrams, "Method should return true.");
    }

    @DisplayName("String - are anagrams - not anagrams")
    @Test
    void testAreAnagrams_whenStringsAreNotAnagrams_returnsTrue() {

        String s1 = "schoolmaster";
        String s2 = "the classroom";

        boolean areAnagrams = StringUtils.areAnagrams(s1, s2);

        assertFalse(areAnagrams, "Method should return false.");
    }
}