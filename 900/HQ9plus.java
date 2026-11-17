// Question Link : https://codeforces.com/problemset/problem/133/A

// Explanation
// We are given a string representing a program written in the HQ9+ programming language. We need to determine whether executing this program will produce any output.

// In HQ9+, there are four special instructions:
//
//     'H' prints "Hello, World!"
//     'Q' prints the source code of the program itself.
//     '9' prints the lyrics of "99 Bottles of Beer".
//     '+' increments the internal accumulator but does not produce output.

// All other characters are ignored.

// To solve this problem, we use a Simple String Traversal approach.

// First, we read the input string s using nextLine().

// Next, we traverse the string character by character using a for loop.

// For every character, we check whether it is equal to 'H', 'Q', or '9'.

//     s.charAt(i) == 'H' || s.charAt(i) == 'Q' || s.charAt(i) == '9'

// The key observation is that only these three characters can produce output. The '+' instruction does not produce any output, and all other characters are ignored.

// If any of these three characters is found:

//     1. We immediately return "YES" because executing the program
//        will produce output.
//     2. There is no need to check the remaining characters.

// If the loop finishes without finding any of these characters, we return "NO" because the program will not produce any output.

// In the main method, we call the check() function and print the returned result.

// Example 1:
//     Input: abcde

//     We traverse the string:
//         a -> Ignored
//         b -> Ignored
//         c -> Ignored
//         d -> Ignored
//         e -> Ignored
//
//     No 'H', 'Q', or '9' is found.

//     Output: NO

// Example 2:
//     Input: abHc

//     We traverse the string:
//         a -> Ignored
//         b -> Ignored
//         H -> Produces output

//     As soon as we find 'H', the function returns "YES".

//     Output: YES

// Example 3:
//     Input: +++

//     All characters are '+' instructions, which only increment the
//     internal accumulator and do not produce output.

//     Output: NO

// This approach works because according to the HQ9+ language rules, only the characters 'H', 'Q', and '9' produce output. Therefore, finding even one of these characters is sufficient to determine that the program will produce output.

// Time Complexity: O(n), where n is the length of the input string, because in the worst case, we traverse the entire string.

// Space Complexity: O(1), because we use only a constant amount of extra space and do not create any additional data structures.

import java.util.*;
public class HQ9plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
        sc.close();
    }
    public static String check(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'H' || s.charAt(i) == 'Q' || s.charAt(i) == '9') {
                return "YES";
            }
        }
        return "NO";
    }
}