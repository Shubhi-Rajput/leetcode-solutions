class Solution {
    public int totalFruit(int[] fruits) {
        int count=0;
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
}