public class Solution2 {
   
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 0b00000010100101000001111010011100;
        System.out.println(solution.reverseBits(n));
    }
}
