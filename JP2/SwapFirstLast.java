//5.Write a Java program to swap the first and last elements of an array(length must be atleast1) and create
// another array.
// Original Array: [20, 30, 40]
// Newarray afterswaping the first and last elements:[40, 30, 20]
import java.util.Scanner;
class SwapFirstLast
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

         for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
       int newArray[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)          //Create new array after swap
        {
          newArray[i]=arr[i];
       }
    
       int  temp = newArray[0];
      newArray[0] = newArray[arr.length-1];
       newArray[arr.length-1] = temp;

       for(int i:newArray)
       {
          System.out.print(i+" ");
       }

    }
}