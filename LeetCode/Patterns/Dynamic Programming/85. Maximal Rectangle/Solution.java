class Solution {
    public int maximalRectangle(char[][] matrix) {
/*        int rows = matrix.length;
        int cols = matrix[0].length;
        int max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '0')
                    continue;
                int width = cols;
                for (int k = i; k < rows; k++) {
                    if (matrix[k][j] == '0')
                        break;
                    int currentWidth = 0;
                    for (int l = j; l < cols; l++) {
                        if (matrix[k][l] == '1')
                            currentWidth++;
                        else
                            break;
                    }
                    width = Math.min(width, currentWidth);
                    int height = k - i + 1;
                    max = Math.max(max, width * height);
                }
            }
        }
        return max;
    }
}*/
         if (matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;
        for (int i = 0; i < rows; i++) {
            // Build histogram
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangle(heights));
        }
        return maxArea;
    }
    private int largestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[stack.peek()] >= heights[i])) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}