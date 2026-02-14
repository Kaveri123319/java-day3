import java.util.*;
public class leap_year {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("It is a Leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
        sc.close();
    }
}
