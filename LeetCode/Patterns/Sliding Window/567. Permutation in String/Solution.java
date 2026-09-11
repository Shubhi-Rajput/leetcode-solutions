class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int k = s1.length();
        int[] freq1 = new int[128];
        int[] freq2 = new int[128];
        // Frequency of s1
        for (int i = 0; i < k; i++) {
            freq1[s1.charAt(i)]++;
        }
        // First window of s2
        for (int i = 0; i < k; i++) {
            freq2[s2.charAt(i)]++;
        }
        if (Arrays.equals(freq1, freq2)) {
            return true;
        }
        int l = 0;
        int r = k;
        while (r < s2.length()) {
            // Add right character
            freq2[s2.charAt(r)]++;
            // Remove left character
            freq2[s2.charAt(l)]--;
            l++;
            r++;
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }
}
/*        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String target = new String(arr1);
        int k = s1.length();
        for (int i = 0; i <= s2.length() - k; i++){
            String sub = s2.substring(i, i + k);
            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);
            if (target.equals(new String(arr2))){
                return true;
            }
        }
        return false;
    }
}*/