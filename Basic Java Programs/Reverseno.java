import java.util.Scanner;
class Reverseno
{
    public static void main(String args[])
    {
         int n,r;
         System.out.print("Enter number: ");
         Scanner sc =new Scanner(System.in);
         n=sc.nextInt();
        while(n>0)
        {
            r = n % 10;
            System.out.print(r);
            n = n / 10;
        }
    }
}

import java.util.Scanner;
class reverse
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
        System.out.println(rev);
    }
}