package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Temp {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 2, 3, 4, 5}, 8);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        // This map used to cache a read number store as <number, index>
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // find diff
            int diff = target - nums[i];
            // If map contain diff return index of current number (i)
            // and index of diff
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            // Other case, put the nums as key and index as value
            map.put(nums[i], i);
        }
        // default return in case of not found
        return new int[]{-1, -1};
    }
}
