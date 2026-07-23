class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }
        
        int zeros = s.length() - ones;
        
        StringBuilder sb = new StringBuilder();
        
        // Append (ones - 1) '1's at the front
        for (int i = 0; i < ones - 1; i++) {
            sb.append('1');
        }
        
        // Append all '0's
        for (int i = 0; i < zeros; i++) {
            sb.append('0');
        }
        
        // Append final '1' at the end
        sb.append('1');
        
        return sb.toString();
    }
}
