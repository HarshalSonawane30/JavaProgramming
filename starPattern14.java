import java.util.*;


public class starPattern14 {
        public static void main(){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n*2;j++){
                if(i+j<=n+1||j-i>=n){
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
