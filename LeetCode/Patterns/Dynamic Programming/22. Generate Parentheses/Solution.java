class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if(n == 0) {
            ans.add("");
            return ans;
        }
        List<String> prev = generateParenthesis(n - 1);
        for(String s : prev) {
            ans.add("(" + s + ")");
            ans.add("()" + s);
            ans.add(s + "()");
        }
        return new ArrayList<>(new LinkedHashSet<>(ans));
    }
}