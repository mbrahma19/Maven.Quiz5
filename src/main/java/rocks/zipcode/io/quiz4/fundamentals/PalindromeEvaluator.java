package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> list = new ArrayList<>();
        for(String s : StringEvaluator.getAllSubstrings(string)){
            if(isPalindrome(s)){
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return reverseString(string).equals(string);
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
