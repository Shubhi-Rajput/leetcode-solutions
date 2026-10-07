class Solution {
    public int countGoodSubstrings(String s) {
/*        int res=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String ss=s.substring(i,j+1);
                if (j-i+1==3) {
                    if (ss.charAt(0) != ss.charAt(1) &&
                        ss.charAt(1) != ss.charAt(2) &&
                        ss.charAt(0) != ss.charAt(2)){
                        res++;
                        }
                }
            }
        }
        return res;
    }
}*/ //now write optimised one
        int count = 0;
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            // Window size = 3
            if (r - l + 1 == 3) {
                char a = s.charAt(l);
                char b = s.charAt(l + 1);
                char c = s.charAt(r);

                if (a != b && b != c && a != c) {
                    count++;
                }
                // Slide the window
                l++;
            }
            r++;
        }
        return count;
    }
}