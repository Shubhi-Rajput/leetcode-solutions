class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
        }
    }
/*sliding window
int l=0,r=0,max=0;
StringBuilder sb=new StringBuilder();
while(r<s.length()){
char ch=s.charAt(r);
while(sb.indexOf(ch+"")>=0){
sb.deleteCharAt(0);
l++;
}
sb.append(ch);
max=Math.max(max,r-l+1);
r++;
}
return max;
}
} */
/*        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                // move left to max(currentLeft, lastSeen+1) to avoid going backwards
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}*/
