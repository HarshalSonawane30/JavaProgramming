import java.util.Scanner;
public class numPattern9 {
    public static void main(){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();    
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=j){
                    System.out.print(j);

                }   
                else{
                    System.out.print(" ");

                }

            }
            System.out.println();
        }    
    }
}
