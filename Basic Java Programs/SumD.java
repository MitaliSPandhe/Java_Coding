import java.util.Scanner;
class SumD
{
    public static void main(String args[])
    {
        int n,s=0,r;
         System.out.print("Enter number: ");
         Scanner sc =new Scanner(System.in);
         n=sc.nextInt();
        while(n>0)
        {
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        System.out.print(s);
    }
}

import java.util.Scanner;
class SumofDigits{
    public static void main(String args[]){
     int n,s=0,r;
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        while(n>0){
            r=n%10;
            s=s+r;
            n=n/10;
           
        }
         System.out.print(s);
    }
}