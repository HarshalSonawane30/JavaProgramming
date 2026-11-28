import java.util.*;

public class charPattern1{
    public static void charPattern1(int n){
        char ch='A';
        for (int i=1;i<=n;i++){
            char temp=ch;
            for(int j=1;j<=n;j++){
                System.out.print(" "+temp);
                temp++;
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
