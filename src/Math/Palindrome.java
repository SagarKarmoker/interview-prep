package Math;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();

        return sb.toString().equals(s1);
    }
}
