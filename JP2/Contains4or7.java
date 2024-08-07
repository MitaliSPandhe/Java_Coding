//2.Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
//Original Array: [5, 7] o/p:true
import java.util.Scanner;
class Contains4or7
{
    public static void main(String args[])
    {
        int a[]=new int[2];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            a[i]=sc.nextInt();
        }
        if(a[0]==4||a[1]==4||a[0]==7||a[1]==7)
        {
            System.out.println("4 0r 7 is presesnt");
        }
        else
        {
            System.out.println("4 0r 7 is not presesnt");
        }
    }
}