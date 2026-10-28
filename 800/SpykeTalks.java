// Question Link : https://codeforces.com/problemset/problem/291/A
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
