package com.myproject.string;

import java.util.*;

/**
 * @author Miroslav Kološnjaji
 */
public class StringUtils {

    public static int findVowels(String input) {

        if (input == null)
            return 0;

        String vowels = "AEIOU";
        int counter = 0;
        for (var ch : input.toUpperCase().toCharArray())
            if (vowels.contains(Character.toString(ch)))
                counter++;

        return counter;
    }

    public static String reverse(String input) {

        if (input == null)
            return "";

        StringBuilder sb = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }

    public static String reverseWords(String input) {

        if (input == null)
            return "";

        String[] reversed = input.trim().split(" ");
        Collections.reverse(Arrays.asList(reversed));
        return String.join(" ", reversed);

    }

    public static boolean isRotation(String word1, String word2) {
        return (word1.length() == word2.length()) && (word1 + word1).contains(word2);
    }

    public static String removeDuplicates(String word) {

        if (word == null)
            return "";

        Set<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (var ch : word.toCharArray()) {

            if (!set.contains(ch)) {
                stringBuilder.append(ch);
                set.add(ch);
            }
        }


        return stringBuilder.toString();
    }

    public static Character mostRepeatedChar(String word) {

        if (word == null || word.isEmpty())
            throw new IllegalArgumentException();

        Map<Character, Integer> map = new HashMap<>();
        int counter;

        Character c = null;
        int counter2 = 0;

        for (var ch : word.toCharArray()) {
            counter = 1;

            if (ch == ' ') continue;

            if (!map.containsKey(ch)) {
                map.put(ch, counter);
                continue;
            }

            counter = map.get(ch);
            map.replace(ch, ++counter);

            if (counter2 < counter) {
                c = ch;
                counter2 = counter;
            }
        }

        System.out.println(map);
        return c;
    }

    public static String capitalizeFirstLetter(String sentence) {

        if(sentence == null || sentence.isEmpty())
            return "";

        String[] words = sentence.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!(words[i].isEmpty()) && !(words[i].length() == 1)) {
                sb.append(words[i].substring(0, 1).toUpperCase().concat(words[i].substring(1).toLowerCase())).append(" ");
            } else  {
                sb.append(words[i].substring(0, 1).toUpperCase()).append(" ");
            }
        }

        return sb.toString().trim();
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1 == null || str1.isEmpty())
            throw new IllegalArgumentException();

        if (str2 == null || str2.isEmpty())
            throw new IllegalArgumentException();

        if(str1.length() != str2.length())
            return false;

        Set<Character> set = new HashSet<>();
        for (var ch : str1.toLowerCase().toCharArray())
            set.add(ch);

        for (var ch : str2.toLowerCase().toCharArray())
            if (!set.contains(ch))
                return false;

        return true;
    }

    public static boolean isPalindrome(String str) {

        if (str == null || str.isEmpty())
            return false;

        int rearIndex = str.length() - 1;

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (rearIndex < i)
                break;

            if (!(chars[i] == chars[rearIndex--]))
                return false;
        }
        return true;
    }

    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null)
            return false;

        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
