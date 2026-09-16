class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (right < fruits.length) {
            // Add current fruit
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            // If there are more than 2 types
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            // Calculate window size
            max = Math.max(max, right - left + 1);
            right++;  // IMPORTANT
        }
        return max;
    }
}
/*        int count=0;
        for(int i=0;i<fruits.length;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<fruits.length;j++){
                set.add(fruits[j]);
                if(set.size()>2){
                    break;
                }
                count=Math.max(count,j-i+1);
            }
        }
        return count;
    }
}*/