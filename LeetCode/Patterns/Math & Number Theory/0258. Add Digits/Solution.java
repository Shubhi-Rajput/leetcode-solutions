class Solution {
    public int addDigits(int num) {
 //   boolean isNegative = num < 0;                   // Check if number is negative
 
    num = Math.abs(num);                         // Work with absolute value

    // Repeat until single digit
    while (num > 9) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        num = sum;
    }
    return num;//isNegative ? -(int) num : (int) num;    // Restore sign if negative 
    }
}