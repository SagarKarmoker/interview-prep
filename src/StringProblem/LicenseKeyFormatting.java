package StringProblem;
//https://leetcode.com/problems/license-key-formatting/
public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String str = "2-5g-3-J";
        String result = licenseKeyFormatting(str, 2);
        System.out.println(result);
    }

    public static String licenseKeyFormatting(String str, int k) {
        char[] arr= str.toCharArray();
        int count = 0; //dash counter
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != '-'){
                sb.append(arr[i]);
                if(count >= 1){
                    count++;
                }
            }else if(arr[i] == '-' && count == 0 || count >= 1 && (count-k == 1)){
                sb.append(arr[i]);
                count++;
            }else if(arr[i] == '-' && (count-k == 1)){
                sb.append(arr[i]);
                count=1;
            }
        }

        return sb.toString().toUpperCase();
    }
}
