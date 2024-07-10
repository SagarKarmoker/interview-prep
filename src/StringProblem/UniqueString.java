package StringProblem;

public class UniqueString {

    public static boolean isUnique(String str) {
         if(str.length() > 128) return false;
         boolean[] isUnique = new boolean[128];

         for (int i = 0; i < str.length(); i++) {
             int charIndex = str.charAt(i);

             if(isUnique[charIndex]) {
                 return false;
             }
             isUnique[charIndex] = true;
         }
         return true;
    }

    public static void main(String[] args) {
        String str = "abcda";
        System.out.println(isUnique(str));
    }
}
