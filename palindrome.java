public class palindrome {
    public static void main(String args[])
    {
        int num=121;
        int temp=num;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(num==rev)
        {
            System.out.println(rev);
        }
    }
}
