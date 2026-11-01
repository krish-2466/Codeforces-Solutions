// Question Link : https://codeforces.com/problemset/problem/160/A

// Explanation
// We are given n coins, each having a particular value. We need to select the
// minimum number of coins such that the sum of our selected coins is strictly
// greater than the sum of all the remaining coins.

// To achieve this, we use a Greedy approach.

// First, we calculate the total sum of all coin values and store it in sum1.
// Initially, sum1 represents the total value of all coins.

// Next, we sort the array in ascending order so that the coins with the largest values are placed at the end of the array.

// The key observation is that selecting the coins with the largest values first allows us to reach the required sum using the minimum number of coins.

// We traverse the sorted array from right to left, selecting the largest coins one by one.

// For every selected coin:
//     1. Subtract its value from sum1 because it is no longer part of the
//        remaining coins.
//     2. Add its value to sum2, which represents the total value of our
//        selected coins.
//     3. Increment count to track the number of selected coins.

// After selecting each coin, we check the following condition:

//     sum2 > sum1

// If this condition becomes true, it means the total value of our selected coins is strictly greater than the total value of the remaining coins.

// At this point, we stop selecting coins because the required condition is
// satisfied with the minimum number of selected coins.

// Finally, we print count as the answer.

// For example, if the coin values are:
//     [3, 2, 1, 4, 5]

// First, calculate the total sum:
//     sum1 = 3 + 2 + 1 + 4 + 5 = 15

// After sorting the array:
//     [1, 2, 3, 4, 5]

// Now, select coins from the largest to the smallest:

// Step 1: Select 5
//     sum2 = 5
//     sum1 = 10
//     Since 5 is not greater than 10, continue.

// Step 2: Select 4
//     sum2 = 5 + 4 = 9
//     sum1 = 10 - 4 = 6
//     Since 9 > 6, we stop.

// Therefore, the minimum number of coins required is 2.

// This greedy approach works because selecting the largest-valued coins first maximizes the sum obtained with each selection.

// Consequently, if any selection of k coins can make our sum strictly greater than the remaining sum, selecting the k largest coins will also satisfy the condition. This guarantees that the minimum possible number of coins is selected.

// Time Complexity: O(n log n), because sorting the array takes O(n log n) time and traversing the array takes O(n) time.

// Space Complexity: O(n) for storing the input array.


import java.util.*;
public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum1 += arr[i];
        }
        Arrays.sort(arr);
        for(int i = n - 1; i >= 0; i--) {
            sum1 -= arr[i];
            sum2 += arr[i];
            count++;
            if(sum2 > sum1) {
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}