import java.util.*;
public class if_else_using_scanner {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("The given number is positive number");
        }
        else if(num<0){
            System.out.println("The given number is negative number");
        }
        else{
            System.out.println("The given number is zero");
        }
        sc.close();
    }
}
