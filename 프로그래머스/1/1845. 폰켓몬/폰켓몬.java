import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int size = nums.length / 2;
        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        return Math.min(numMap.size(), size);
    }
}