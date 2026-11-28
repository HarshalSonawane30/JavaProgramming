 import java.util.*;

public class charPattern2 {
    public static void charPattern1(int n){
        char ch='A';
        for (int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(" "+ch);
                
                
            }
            
            System.out.println();
            
        }
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        charPattern1(n);
    }
}

