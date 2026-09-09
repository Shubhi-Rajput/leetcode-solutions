class Solution {
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || 
               c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int l=0;
        int r=0;
        int count=0;
        int max=0;
        while (r < s.length()) {
            if (isVowel(s.charAt(r))) {
                count++;
            }
            r++;
            while (r - l > k) {
                if (isVowel(s.charAt(l))) {
                    count--;
                }
                l++;
            }
            if (r - l == k) {
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
        /*while(r<k){
            char c=s.charAt(r);
            if(isVowel[c]) count++;
            r++;
        }
        int max=count;
        while(r<s.length()){
            char c1=s.charAt(l);
            if(isVowel[c1]) count--;
            char c2=s.charAt(r);
            if(isVowel[c2]) count++;
            max=Math.max(max,count);
            if(max==k) return max;
        }
        return max;
    }
}*/