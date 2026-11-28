 import java.util.*;

public class charPattern5{
    public static void charPattern1(int n){
        
        for (int i=n;i>=1;i--){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(" "+ch);
                ch++;
                
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

