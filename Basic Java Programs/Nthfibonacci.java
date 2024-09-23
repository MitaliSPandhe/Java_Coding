import java.util.Scanner;
class Nthfibonacci
{
    public static int nthFibonacci(int input)
    {
        if(input==1)
        {
            return 0;
        }
        else if(input==2)
        {
            return 1;
        }
        else if(input==3)
        {
            return 1;
        }
        else
        {
            return (nthFibonacci(input-1)+nthFibonacci(input-2));
        }
    }

    public static void main(String args[])
    {
        int num,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        num=sc.nextInt();
        result=nthFibonacci(num);
        System.out.println(result);

    }
}