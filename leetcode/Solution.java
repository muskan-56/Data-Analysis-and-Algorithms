public class Solution {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n)); 
    }
    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
