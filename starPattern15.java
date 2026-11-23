// ********
// ***  ***
// **    **
// *      *
// **    **
// ***  ***
// ********
// ********  
  
  import java.util.*;
public class starPattern15 {
        public static void main(){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n*2;i++){
            for (int j=1;j<=n*2;j++){
                if(i+j<=n+1||i-j>=n-1||i+j<=n+1||j-i>=n||i+j>=n*3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }        
    }
}

