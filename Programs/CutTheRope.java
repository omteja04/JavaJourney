package Programs;
import java.util.*;
public class CutTheRope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rope = sc.nextInt();
        int required = sc.nextInt();
        boolean ans;
        if (rope % 2 == 1 && required % 2 == 0)
            ans = false;
        else
            ans = true;
        System.out.print(ans ? "YES" : "NO");
        sc.close();
    }
}

