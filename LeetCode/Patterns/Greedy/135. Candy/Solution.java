class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];
        // Give every child 1 candy
        for (int i = 0; i < n; i++) {
            candy[i] = 1;
        }
        // Left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        // Right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }
        // Calculate total
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += candy[i];
        }
        return total;
    }
}

/*        // Calculate total
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += candy[i];
        }

        return total;
        int n = ratings.length;
        int[] candies = new int[n];
        // Give every child 1 candy initially
        Arrays.fill(candies, 1);
        // Left to Right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        // Right to Left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        // Calculate answer
        int total = 0;
        for (int candy : candies) {
            total += candy;
        }
        return total;
    }
}*/