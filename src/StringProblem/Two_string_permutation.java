package StringProblem;
//not a optimal solution
public class Two_string_permutation {
    static String sort(String str){
        char[] arr = str.toCharArray();
        java.util.Arrays.sort(arr); //sorted
        return new String(arr); // returning new array as sorted
    }

    public static boolean permutation(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        return sort(a).equals(sort(b));
    }

    public static void main(String[] args) {
        String a = "abca";
        String b = "abca";

        System.out.println(permutation(a, b));
    }
}
