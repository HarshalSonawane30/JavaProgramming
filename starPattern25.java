// *     * * * *   
// *     *         
// *     *         
// * * * * * * *   
//       *     *   
//       *     *   
// * * * *     *   


import java.util.*;

public class starPattern25 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();


        for (int i=1;i<n*2;i++){
            for (int j=1;j<=n*2;j++){
                if( j==1 && i<=n ||
                    i==n && j<n+1||
                    j==n && i<n+1 ||
                    i==1 && i+j<=n*2 && i+j>n ||
                    i==n && i+j>n && i+j<n*3 ||
                    j==n*2-1 && i+j>n*3-1||
                    j==n && i+j>=n*2 && i+j<n*3 ||
                    i==n*2-1 && j<n ){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
