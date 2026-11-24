import java.util.*;

public class startPattern26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n * 2; i++) {

            for (int j = 1; j < n * 2; j++) {

                int d = Math.abs(i - n) + Math.abs(j - n);

                if (d == n - 1 || d == n - 3) {   // outer diamond || inner diamond
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}