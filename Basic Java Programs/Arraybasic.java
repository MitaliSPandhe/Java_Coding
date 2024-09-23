import java.util.Scanner;

class Arraylength
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the Size");
       int n=sc.nextInt();
       
       int arr[]=new int[n];
       String ar[]=new String[]{"hello","bye","good","morning"};
        System.out.print("enter the Elements");
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();

        }
         for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+ " ");

        }
         for(int i=0;i<ar.length;i++)
        {
          System.out.print(ar[i]+ " ");

        }
        
          System.out.print(ar.length);


    }
}