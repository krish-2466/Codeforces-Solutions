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
