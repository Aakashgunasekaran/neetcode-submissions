class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        binary = String.format("%32s",binary).replace(' ','0');
        String  binary1 = new StringBuilder(binary).reverse().toString();
        return (int) Long.parseLong(binary1,2);

        
    }
}
