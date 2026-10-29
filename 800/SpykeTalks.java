// Question Link : https://codeforces.com/problemset/problem/291/A


// Explanation
// Each secretary is either not talking (session ID = 0) or participating in a call identified by a positive session ID. Since every call connects exactly two people, each non-zero session ID must appear exactly twice.
// To solve this problem, we use a HashMap to count the frequency of each session ID.
// For every input number a, we increment its frequency using:
//     map.put(a, map.getOrDefault(a, 0) + 1);
// The session ID 0 is ignored because it represents a secretary who is not talking.
// We then traverse the HashMap and check the frequency of each non-zero session ID.
// There are three possible cases:
// 1. If a session ID appears exactly twice, it represents one valid call.Therefore, we increment the count of calls by 1.
// 2. If a session ID appears more than twice, the data is invalid because one call cannot connect more than two people. In this case, we set count = -1 and stop.
// 3. If a session ID appears only once, it represents a call involving one secretary from the corporation and another person from outside the corporation.
// This is valid because calls can also involve people from other places.
// Finally, we print the total number of valid calls if the data is consistent.
// Otherwise, we print -1.
// For example, if the input sequence is:
//     [0, 12, 5, 12, 5]
// Session ID 0 appears once, so it is ignored.
// Session ID 12 appears twice, representing one call.
// Session ID 5 appears twice, representing another call.
// Therefore, the answer is 2.
// If the sequence is:
//     [7, 7, 7, 0]
// Session ID 7 appears three times, which is impossible because a call connects exactly two people. Therefore, the answer is -1.
// Time Complexity: O(n), assuming average O(1) HashMap operations.
// Space Complexity: O(n), because the HashMap can store up to n distinct session IDs.


import java.util.*;
public class SpykeTalks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getKey() != 0 && e.getValue() > 2) {
                count = -1;
                break;
            }
            else if(e.getKey()!= 0 && e.getValue() == 2) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
