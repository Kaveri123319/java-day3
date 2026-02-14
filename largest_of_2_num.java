import java.util.*;
public class largest_of_2_num {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is largest number");
        }
        else{
            System.out.println("b is largest number");
        }
        sc.close();
    }
}
