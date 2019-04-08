package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String value;
    public PalindromeObject(String input) {
        value = input;
    }

    public String[] getAllPalindromes(){
        return PalindromeEvaluator.getAllPalindromes(value);
    }

    public Boolean isPalindrome(){
        return PalindromeEvaluator.isPalindrome(value);
    }

    public String reverseString(){
        return PalindromeEvaluator.reverseString(value);
    }
}
