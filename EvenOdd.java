import java.util.*;
public class EvenOdd {

        public static void checkEvenOdd(int num){
            if(num%2==0){
                System.out.println("Even");
            }

            else{
                 System.out.println("Odd");
            }

        }
        public static void checkDivisibility(int num){
            String res=(num%3==0 && num%5==0)?"Divisible by both":(num%3==0)?"Divisible by 3":
		(num%5==0)?"Divisible by 5":"Not Divisible by Both";
		System.out.println(res);

        }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        checkEvenOdd(num);
        checkDivisibility(num);

		
	}
}
    

