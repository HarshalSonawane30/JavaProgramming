import java.util.*;
public class Voting {

        public static void vote(int age){
            if(age>18){
                System.out.println("Eligible to vote");
            }
          
            
            else{
                 System.out.println(" not eligible to vote");
            }

        }
        public static void voteter(int age){
            String res=(age>18)?"Eligible to vote":"Not eligible to vote";
		System.out.println(res);

        }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        vote(age);
        voteter(age);

		
	}
}
    

//eligible for army or not age 25 - 35