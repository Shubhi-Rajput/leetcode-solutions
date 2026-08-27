class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int count=0;
        StringBuilder sb= new StringBuilder();
        while(j<chars.length){
            if(chars[i]!=chars[j]){
                sb.append(chars[i]);
                if(count>1)sb.append(count);
                count=1;
                i=j;
            }
            else{
                count++;
            }
            j++;
        }
        sb.append(chars[i]);
        if(count>1)sb.append(count);
        for(int p=0;p<sb.length();p++){
            chars[p]=sb.charAt(p);
        }
            return sb.length();
    }
}