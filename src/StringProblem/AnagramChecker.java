package StringProblem;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        return Arrays.equals(aArray, bArray);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        System.out.println(isAnagram(str1, str2));
    }
}
