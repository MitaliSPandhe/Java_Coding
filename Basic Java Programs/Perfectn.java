import java.util.Scanner;
class Perfectn
{
    public static void main(String args[])
    {
        int n,s=0;
        System.out.print("Enter the element");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(n==s)
        {
            System.out.print("perfect number");
        }
        else{
            System.out.print("Not a perfect number");
        }
    }
}

import java.util.Scanner;
class PerfectNo{
    public static void main(String args[]){
        int sum=0;
       System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.print("Perfect no");
        }
        else{
            System.out.print("Npt Perfect no");
        }

    }
}
 