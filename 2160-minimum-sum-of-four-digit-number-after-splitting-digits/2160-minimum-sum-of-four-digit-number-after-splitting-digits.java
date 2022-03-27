import java.util.*;

class Solution {
    public int minimumSum(int num) {
        // new1, new2로 쪼개야한다
        int[] nums = new int[4];
        
        int loop = 0;
        while (loop < 4) {
            nums[loop++] = num % 10;
            num /= 10;
        }
        
        // new1, new2 sorting
        // 2239
        Arrays.sort(nums);
        
        // 하나의 숫자로 합치기
        String new1 = String.valueOf(nums[0]) + String.valueOf(nums[2]); // 23
        String new2 = String.valueOf(nums[1]) + String.valueOf(nums[3]); // 29
        
        return Integer.parseInt(new1) + Integer.parseInt(new2);
    }
}