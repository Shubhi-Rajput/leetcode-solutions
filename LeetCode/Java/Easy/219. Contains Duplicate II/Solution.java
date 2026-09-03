class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (i - j <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
//time limit exceed with these below methods
/*for(int l=0;l<nums.length;l++){
    int c=0;
    int r=l+1;
    while(r<nums.length && c<k){
        if(nums[l]==nums[r]) return true;
        c++;
        r++;
    }
}
return false;
    }
}
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;i++){
                if(nums[i]==nums[j] && j-i<= k){
                    return true;
                    }
                }
            }
            return false;
        }
    }*/