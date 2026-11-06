// Question Link : https://codeforces.com/problemset/problem/598/A

// Explanation
// We are given an integer n. We need to calculate the sum of all integers from 1 to n, but all powers of 2 must be considered negative instead of positive.

// To solve this problem efficiently, we use a Mathematical approach.

// First, we calculate the sum of all integers from 1 to n using the arithmetic progression formula:

//     s = n * (n + 1) / 2

// Here, s represents the initial sum of all integers from 1 to n.

// Next, we initialize a variable pow = 1, which represents the current
// power of 2.

// The key observation is that every power of 2 must be changed from positive to negative.

// For example:
//     1 = 2^0
//     2 = 2^1
//     4 = 2^2
//     8 = 2^3

// Since these numbers are already included as positive values in our initial sum, we need to subtract twice their value to make them negative.

// For example:
//     +1 should become -1
//     Therefore, we subtract 2 from the total sum.

// We use a while loop that runs as long as pow <= n.

// Inside the loop:
//     1. Subtract pow * 2 from s because the current power of 2
//        needs to be changed from positive to negative.
//     2. Multiply pow by 2 to get the next power of 2.

//     pow *= 2

// We continue this process until pow becomes greater than n.

// After processing all powers of 2, s contains the required sum.

// Finally, we print s for each test case.

// Example:
//     n = 4

// First, calculate the sum of all integers from 1 to 4:

//     s = 4 * (4 + 1) / 2
//     s = 10

// Now, process all powers of 2:

// Step 1: pow = 1
//     s = 10 - (1 * 2) = 8

// Step 2: pow = 2
//     s = 8 - (2 * 2) = 4

// Step 3: pow = 4
//     s = 4 - (4 * 2) = -4

// Now, pow becomes 8, which is greater than n, so the loop stops.

// Therefore, the final answer is -4.

// This approach works because the initial formula calculates the sum of all numbers as positive. For every power of 2, subtracting twice its value effectively changes its contribution from positive to negative.

// We only iterate through powers of 2 instead of all integers from 1 to n, making the solution efficient even for large values of n.

// Time Complexity: O(log n), because we iterate through powers of 2.

// In every iteration, pow is multiplied by 2, so the loop runs approximately log2(n) times.

// Space Complexity: O(1), because we use only a constant amount of extra space regardless of the value of n.

import java.util.*;
public class TrickySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for(int  i = 1; i <= t; i++) {
            long n = sc.nextLong();
            long s = (n * (n + 1)) / 2;
            long pow = 1;
            while(pow <= n) {
                s -= pow * 2;
                pow *= 2;
            }
            System.out.println(s);
        }
        sc.close();
    }
}