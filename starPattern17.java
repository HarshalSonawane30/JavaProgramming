// *             * 
// * *         * * 
// * * *     * * * 
// * * * * * * * * 
// * * *     * * * 
// * *         * * 
// *             * 

import java.util.*;

public class starPattern17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {

            int row = (i <= n) ? i : 2 * n - i;

            for (int j = 1; j <= 2 * n; j++) {

                if (j <= row || j > 2 * n - row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
