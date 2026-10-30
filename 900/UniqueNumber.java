// Question Link : https://codeforces.com/problemset/problem/1462/C

// Explanation
// We need to find the smallest positive integer whose digit sum is equal to x and whose digits are all distinct.
// Since every digit must be unique, we can use each digit from 1 to 9 at most once.
// The maximum possible sum of distinct digits is:
//     1 + 2 + 3 + ... + 9 = 45
// Therefore, if x > 45, it is impossible to form such a number, so we print -1.
// Otherwise, we use a greedy approach to construct the smallest possible number.
// To minimize the number itself, we first try to use the largest available digits.
// This helps us achieve the required sum using fewer digits.
// We initialize d = 9 and check whether the current digit can be subtracted from x.
// If x - d >= 0:
//     1. Append d to the StringBuilder.
//     2. Subtract d from x.
//     3. Decrease d and continue checking.
// We repeat this process until x becomes 0.
// At this point, we have selected the largest possible distinct digits whose sum is exactly equal to the original x.
// However, the digits are currently stored in descending order.
// To obtain the smallest possible number, we reverse the StringBuilder so that the selected digits appear in ascending order.
// Finally, we print the constructed number.
// For example, if x = 20:
// We select digits greedily:
//     9  -> Remaining sum = 20 - 9 = 11
//     8  -> Remaining sum = 11 - 8 = 3
//     7  -> Cannot be selected because 3 - 7 < 0
//     6  -> Cannot be selected
//     ...
//     3  -> Remaining sum = 3 - 3 = 0
// The selected digits are:
//     9 8 3
// After reversing them:
//     3 8 9
// Therefore, the smallest valid number is:
//     389
// This approach works because selecting the largest possible distinct digits minimizes the number of digits required. Once the number of digits is minimized, arranging those digits in ascending order produces the smallest possible number.
// Time Complexity: O(1) per test case, because we check at most 9 distinct digits.
// Space Complexity: O(1), because the StringBuilder stores at most 9 digits.


import java.util.*;
public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            int x = sc.nextInt();
            if(x > 45) {
                System.out.println(-1);
            }
            else {
                StringBuilder s = new StringBuilder();
                int d = 9;
                while(true) {
                    if(x - d >= 0) {
                        x -= d;
                        s.append(d);
                    }
                    d--;
                    if(x == 0) {
                        break;
                    }
                }
                s.reverse();
                System.out.println(Integer.parseInt(s.toString()));
            }
        }
        sc.close();
    }
}