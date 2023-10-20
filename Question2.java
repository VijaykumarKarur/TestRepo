//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//        typically using all the original letters exactly once.
//
//        Example 1:
//        Input: s = "anagram", t = "nagaram"
//        Output: true

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st String: ");
        String s = scan.nextLine();
        System.out.print("Enter the 2nd String: ");
        String t = scan.nextLine();
        System.out.println(areAnagrams(s, t));
    }

    public static boolean areAnagrams(String s, String t){
        if(s.length() != t.length())
            return false;
        else{
            char[] charArray1 = s.toCharArray();
            char[] charArray2 = t.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            for(int i = 0; i<charArray1.length; i++){
                if(charArray1[i] != charArray2[i])
                    return false;
            }
            return true;
        }
    }
}
