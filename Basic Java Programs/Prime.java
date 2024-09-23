import java.util.Scanner;

class Prime
{
    public static void main(String args[])
    {
        int n,count=0;
        System.out.print("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            count++;
        
         }
    }
    if(count==2)
    {
        System.out.print("prime");
    }
    else
    {
        System.out.print("Not prime");
    }
}
}

//Number divisible by 1 and itself
import java.util.Scanner;
class PrimeNo{
    public static void main(String args[]){
        int n,count=0;
         System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
         if(count==2){              //2 represents Number of divisors
                System.out.print("Number is Prime");
            }
            else{
                System.out.print("Number is not prime");
            }
    }
}