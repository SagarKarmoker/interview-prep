package BinarySearch;
//https://leetcode.com/problems/arranging-coins/solutions/5406064/441
public class ArrangingCoins {
    public static void main(String[] args) {
        int res = arrangeCoins(8);
        System.out.println(res);
    }
    public static int arrangeCoins(int n) {
        /*
        * 1
        * 1 2
        * 1 2 #
        * */
        int i = 0;
        while( n > 0){
            i++;
            n -= i;
        }
        return i-1;
    }
}
