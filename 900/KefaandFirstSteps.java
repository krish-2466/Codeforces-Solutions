// Question Link : https://codeforces.com/problemset/problem/580/A

// Explanation
// We are given an array of n integers representing the money Kefa earns on each day. We need to find the length of the maximum non-decreasing contiguous subsegment in the array.

// A subsegment is called non-decreasing if every element is greater than or equal to the previous element.

// To solve this problem, we use a Two Pointer / Sliding Window approach.

// Next, we initialize three variables:

//     i = 0
//     j = 1
//     max = 1

// Here:
//     i represents the starting index of the current non-decreasing
//     subsegment.
//     j represents the index we are currently checking.
//     max stores the maximum length of a non-decreasing subsegment found
//     so far.

// We start j from index 1 because we need to compare each element with its previous element.

// We use a while loop that runs as long as j < n.

// Inside the loop, we check whether the current element is greater than or equal to the previous element:

//     arr[j] >= arr[j - 1]

// If this condition is true, it means the current non-decreasing subsegment continues.

// For every valid element:
//     1. Calculate the current subsegment length using j - i + 1.
//     2. Update max using Math.max(max, j - i + 1).
//     3. Increment j to check the next element.

// If the condition becomes false, it means the current non-decreasing subsegment has ended.

// In that case:
//     1. Set i = j because a new subsegment starts from the current index.
//     2. Increment j to check the next element.

// The inner while loop also checks j < n to ensure that we never access an index outside the array.

// We continue this process until j reaches the end of the array.

// Finally, we print max, which represents the length of the longest non-decreasing contiguous subsegment.

// Example:
//     n = 6
//     arr = [2, 2, 1, 3, 4, 1]

// Initially:
//     i = 0
//     j = 1
//     max = 1

// Step 1: Compare arr[1] and arr[0]
//     2 >= 2 (true)
//     Current length = 1 - 0 + 1 = 2
//     max = 2
//     j = 2

// Step 2: Compare arr[2] and arr[1]
//     1 >= 2 (false)
//     The current subsegment ends.
//     Set i = 2 and increment j to 3.

// Step 3: Compare arr[3] and arr[2]
//     3 >= 1 (true)
//     Current length = 3 - 2 + 1 = 2
//     max = 2
//     j = 4

// Step 4: Compare arr[4] and arr[3]
//     4 >= 3 (true)
//     Current length = 4 - 2 + 1 = 3
//     max = 3
//     j = 5

// Step 5: Compare arr[5] and arr[4]
//     1 >= 4 (false)
//     The current subsegment ends.
//     Set i = 5 and increment j to 6.

// Now j = n, so the loop terminates.

// The longest non-decreasing subsegment is:
//     [1, 3, 4]

// Therefore, the answer is 3.

// This approach works because whenever the current element is smaller than the previous element, the non-decreasing subsegment is broken.
// Therefore, we start a new subsegment from the current index.

// By checking every element exactly once and updating the maximum length whenever the sequence continues, we guarantee that we find the longest non-decreasing contiguous subsegment.

// Time Complexity: O(n), because each element is visited at most once
// by the two pointers.

// Space Complexity: O(n), because we store the input array of n elements.

import java.util.*;
public class KefaandFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j = 1;
        int max = 1;
        while(j < n) {
            while(j < n && arr[j] >= arr[j - 1]) {
                max = Math.max(max, j - i + 1);
                j++;
            }
            i = j;
            j++;
        }
        System.out.println(max);
        sc.close();
    }
}
