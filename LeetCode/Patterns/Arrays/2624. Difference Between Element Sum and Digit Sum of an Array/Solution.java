class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
            int n = nums[i];
            while (n > 0) {
                digitSum += n % 10;
                n = n / 10;
            }
        }
        int answer = Math.abs(elementSum - digitSum);
        return answer;
    }
}
/*        int elementSum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Element sum
            elementSum += nums[i];
            // Convert number to String
            String s = String.valueOf(nums[i]);

            // Calculate digit sum
            for (int j = 0; j < s.length(); j++) {
                digitSum += s.charAt(j) - '0';
            }
        }
    int answer = Math.abs(elementSum - digitSum);
    return answer;
    }
}*/     