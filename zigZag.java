
import java.util.*;

public class zigZag {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] a = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int[] res = new int[m + n];
        int index = 0;

        int c = Math.max(m, n);

        for (int i = 0; i < c; i++) {

            if (i < m) {
                res[index++] = a[i];
            }

            if (i < n) {
                res[index++] = b[i];
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

        sc.close();
    }
}
