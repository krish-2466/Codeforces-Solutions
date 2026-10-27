// Question Link : https://codeforces.com/problemset/problem/1462/A

// Explanation
// The original sequence is written on the whiteboard by placing elements alternately from the beginning and the end of the sequence.
// To restore the original sequence, we need to reverse this process.
// We can observe that the first element of the original sequence is at the beginning of the given sequence, the second element is at the end, the third element is second from the beginning, and the fourth element is second from the end.
// Therefore, we can use two pointers to traverse the given sequence:
//      l = 0       (points to the first element)
//      r = n - 1   (points to the last element)
// While l <= r, we print the element at index l followed by the element at index r.
// After printing both elements, we move l one step forward and r one step backward.
// If l == r, it means only one element remains in the middle of the sequence.
// In this case, we print that element only once to avoid duplication.
// For example, if the given sequence is:
//     b = [3, 4, 5, 2, 9, 1, 1]
// We first print the elements at indices 0 and 6:
//     3 1
// Then the elements at indices 1 and 5:
//     4 1
// Then the elements at indices 2 and 4:
//     5 9
// Finally, the middle element at index 3:
//     2
// The restored sequence is:
//     3 1 4 1 5 9 2
// This approach works because the original sequence was constructed by alternately taking elements from the beginning and the end. Using two pointers allows us to retrieve the elements in exactly that order.
// Time Complexity: O(n) per test case, because each element is processed exactly once.
// Space Complexity: O(n) for the input sequence in an array.
import java.util.*;
public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int l = 0;
            int r = n - 1;
            while(l <= r) {
                if(l == r) {
                    System.out.print(arr[r]);
                }
                else {
                    System.out.print(arr[l] + " " + arr[r] + " ");
                }
                l++;
                r--;
            }
            System.out.println();
        }
        sc.close();
    }
}