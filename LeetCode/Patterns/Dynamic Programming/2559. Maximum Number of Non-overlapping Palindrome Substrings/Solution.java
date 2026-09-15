class Solution {
    public int maxPalindromes(String s, int k) {

        int n = s.length();
        int ans = 0;
        int end = -1;

        for (int i = 0; i < n; i++) {

            // Odd length palindrome
            int l = i;
            int r = i;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                if (r - l + 1 >= k && l > end) {
                    ans++;
                    end = r;
                    break;
                }

                l--;
                r++;
            }

            // Even length palindrome
            l = i;
            r = i + 1;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                if (r - l + 1 >= k && l > end) {
                    ans++;
                    end = r;
                    break;
                }

                l--;
                r++;
            }
        }

        return ans;
    }
}