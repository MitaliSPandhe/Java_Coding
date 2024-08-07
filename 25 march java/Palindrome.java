import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        int rem=0,rev=0,n;
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
       int temp=n;
        while(n!=0)
        {
            rem = n%10;
            rev= (rev*10)+rem;
            n = n/10;

        }
        if(rev==temp)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
        
    }
}