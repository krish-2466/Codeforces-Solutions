// Question Link : https://codeforces.com/problemset/problem/405/A

// Explanation
// We are given an integer n representing the number of columns in a box.
// Each column contains a certain number of cubes. Initially, gravity pulls all the cubes downwards. When gravity is switched, all cubes start moving towards the right side of the box.

// We need to find the number of cubes in each column after the gravity switch.

// To solve this problem, we use a Sorting approach.

// The key observation is that after switching gravity, all cubes will settle towards the right side of the box. This means that the column heights will be arranged in non-decreasing order from left to right.

// First, we read the value of n, which represents the number of columns.

// Next, we create an integer array arr of size n and store the number of cubes in each column.

// After reading the array, we sort it using:

//     Arrays.sort(arr);

// This sorts the column heights in ascending order.

// For example:
//     Initial array:
//         [3, 2, 1, 3]

//     After sorting:
//         [1, 2, 3, 3]

// Sorting rearranges the column heights so that smaller columns come first and larger columns come towards the right side.

// Finally, we traverse the sorted array and print all elements separated
// by spaces.

// We use the condition:

//     if(i == n - 1)

// to check whether we are printing the last element.

// If it is the last element, we print it without an extra space.
// Otherwise, we print the element followed by a space.

// Example:
//     n = 4
//     arr = [3, 2, 1, 3]

// Step 1: Read the number of columns and their heights.

//     arr = [3, 2, 1, 3]

// Step 2: Sort the array in ascending order.
//
//     arr = [1, 2, 3, 3]

// Step 3: Print the sorted array.
//
//     Output: 1 2 3 3

// Therefore, the final column heights after switching gravity are:
//     [1, 2, 3, 3]

// This approach works because switching gravity to the right does not change the total number of cubes. It only changes their positions.
// Consequently, the column heights after the gravity switch are simply the original column heights arranged in non-decreasing order.

// Sorting gives us exactly this arrangement.

// Time Complexity: O(n log n), because Arrays.sort() takes O(n log n) time for sorting the array. Printing the array takes O(n) time.

// Space Complexity: O(n) for storing the input array. The sorting implementation may also use additional internal space.

import java.util.*;
public class GravityFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            if(i == n - 1) {
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}