// Question Link : https://codeforces.com/problemset/problem/2275/A


// Explanation
// The router is located at coordinates (x1, y1), and the computer must be placed at an integer-coordinate point exactly R units away from the router.
// We can use the distance formula between two points:
//     distance = sqrt((x1 - x2)^2 + (y1 - y2)^2)
// To simplify the calculation, we keep the x-coordinate unchanged and move the computer R units downward along the y-axis.
// Therefore, we choose:
//     x2 = x1
//     y2 = y1 - R
// Substituting these coordinates into the distance formula:
//     distance = sqrt((x1 - x1)^2 + (y1 - (y1 - R))^2)
//              = sqrt(0 + R^2)
//              = R
// Thus, the selected point is exactly R units away from the router.
// Since x1, y1, and R are integers, both x2 and y2 are also integers.
// Therefore, the chosen point always satisfies the problem's requirements.
// For example, if the router is at (5, 5) and R = 5:
//     x2 = 5
//     y2 = 5 - 5 = 0
// The output is:
//     5 0
// The distance between (5, 5) and (5, 0) is:
//     sqrt((5 - 5)^2 + (5 - 0)^2) = 5
// Hence, the point is valid.
// Time Complexity: O(1) per test case, because only a constant number of
// arithmetic operations are performed.
// Space Complexity: O(1), because only a constant number of variables are used.


import java.util.*;
public class InSearchofConvenience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r = sc.nextInt();
            int x2 = x1;
            int y2 = y1 - r;
            System.out.println(x2 + " " + y2); 
        }
        sc.close();
    }
}