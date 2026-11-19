import java.util.*;
public class Div {

        public static void div(int num){
            if(num%3==0){
                System.out.println("Divisible by 3");
            }
            else if(num%5==0){
                 System.out.println("Divisible by 5");
            }
            else if(num %3==0 && num%5==0){
                 System.out.println("Divisible by both");
            }
            else{
                 System.out.println(" not Divisible by 3 and 5");
            }

        }
        public static void divter(int num){
            String res=(num%3==0 && num%5==0)?"Divisible by both":(num%3==0)?"Divisible by 3":
		(num%5==0)?"Divisible by 5":"Not Divisible by Both";
		System.out.println(res);

        }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        div(num);
        divter(num);

		
	}
}
    

