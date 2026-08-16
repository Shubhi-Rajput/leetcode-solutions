class Solution {
    public int[] twoSum(int[] nums, int target) {
/*
Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left,right}; 
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};   //just means "no valid answer was found."
    }
}
/*        Map<Integer, Integer>map=new HashMap<>(); //Map<key,value>
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ;
    }
}*/
       int [] arr= new int[2];
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                arr[0]=i;
                arr[1]=j;
                return arr;
                }
            }
        }
        return arr;
    } 
}