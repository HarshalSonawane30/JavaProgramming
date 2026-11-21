//Largest element in an array
import java.util.*;

public class arr2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int temp=0;
        int large=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>temp){
               temp= nums[i];
            }
        }
        System.out.println(temp);
    }    
}
