// 10,11. Write a Java program to sum values of an array.
import java.util.Scanner;
class Example10
{
    public static void main(String args[])
    {
        int s=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

         for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
        for(int i=0;i<arr.length;i++)
            {
               s = s + arr[i];
            }
            System.out.println(s);
        double avg = s /(double)arr.length;
         System.out.println(avg);
    }
}