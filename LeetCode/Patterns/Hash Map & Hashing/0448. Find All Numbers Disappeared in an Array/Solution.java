class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] present = new boolean[nums.length + 1];
        List<Integer> res = new ArrayList<>();
        // mark present numbers
        for (int num : nums) {
            present[num] = true;
        }
        // find missing
        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                res.add(i);
            }
        }
        return res;
    }
}
       /* List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        
        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}*/