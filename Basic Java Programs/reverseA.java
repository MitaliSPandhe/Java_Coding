class reverseA
{
    public static void main(String args[])
    {
        int a[]=new int[]{1,2,3,4,56,67};
        for(int i=a.length-1;i>=0;i--)
        {
           System.out.print(a[i]+" ");
        }
    }
}

import java.util.Scanner;
class Reverse{
    public static void main(String args[]){
     int n,r;
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        while(n>0){    //n=56789
            r=n%10;           //r=56789%10 ====9 ,8,7,6,5
            System.out.print(r);
            n=n/10; //5678

        }
    }
}