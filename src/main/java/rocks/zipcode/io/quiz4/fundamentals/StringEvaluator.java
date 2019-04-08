package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        List<String> list = new ArrayList<>();
        list.add(string);
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                if(!list.contains(string.substring(i,j))){
                    list.add(string.substring(i,j));
                }

            }
        }
        return list.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        List<String> list2 = Arrays.asList(getAllSubstrings(string2));
        List<String> commons = new ArrayList<>();
        for(String s : getAllSubstrings(string1)){
            if(list2.contains(s)){
                commons.add(s);
            }
        }
        return commons.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commons = getCommonSubstrings(string1, string2);
        return Arrays.stream(commons).max(Comparator.comparingInt(String::length)).orElse(null);
    }
}
