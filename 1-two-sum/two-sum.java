import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            // check if required number already exists
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            // store current number with index
            map.put(nums[i], i);
        }

        // as per problem, solution always exists
        return new int[] {};
    }
}
