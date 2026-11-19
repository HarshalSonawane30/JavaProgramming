import java.util.*;

class ArmyEligible {
    public static void checkEligibility(int age){
        if(age>=18 && age<35){
            System.out.println("Eligible for Army");
        }
        else if(age<18 && age>=0){
            System.out.println("Not Eligible for Army");
        }
        else if(age<0){
            System.out.println("Invalid Age");
        }
        else{
            System.out.println("Not Eligible for Army");
        }
    }
    public static void checkEligibilityTernary(int age){
        String res=(age>=18 && age<35)?"Eligible for Army":(age<18 && age>=0)?"Not Eligible for Army":(age<0)?"Invalid Age":"Not Eligible for Army";
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        checkEligibility(age);
        checkEligibilityTernary(age);
    }
}   
    