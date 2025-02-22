//1980: Find Unique Binary String
import java.util.HashSet;
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(String s: nums) {
            int num = 0;
            int n = nums.length - 1;
            for(char c: s.toCharArray()) {
                if(c == '1') {
                    num += Math.pow(2, n);
                }
                n--;
            }
            set.add(num);
        }
        for(int i = 0; i < Math.pow(2, nums.length); i++){
            if(!set.contains(i)) {
                StringBuilder sb = new StringBuilder();
                int n = nums.length - 1;
                while(n >= 0) {
                    if(i >= Math.pow(2, n)) {
                        sb.append("1");
                        i -= Math.pow(2, n);
                    }
                    else {
                        sb.append("0");
                    }
                    n--;
                }
                return sb.toString();
            }
        }
        return "";
    }
}