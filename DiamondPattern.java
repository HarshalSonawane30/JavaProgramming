import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int n = sc.nextInt();

        if (n % 2 == 0 || n < 5) {
           
        } else {
            int m = n / 2; 

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    
                    if (i + j == m || i + j == 3 * m || i - j == m || j - i == m) {
                        System.out.print("* ");
                    }
                  
                    else if ((i + j == 2 * m - 1 || i + j == 2 * m + 1)
                            && (i - j == 1 || j - i == 1)) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}