//Move all 0 to end
import java.util.*;


public class Arr1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
          nums[i]=sc.nextInt();  
        }
        int j=0;
        for (int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
       while(j<nums.length){
        nums[j]=0;
        j++;
       }
        System.out.println(Arrays.toString(nums));
    }    
}
