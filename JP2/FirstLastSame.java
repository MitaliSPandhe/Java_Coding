//1. Write a Java program to test if the first and last elements of an array of integers are the same. The
// array length must be broader than or equal to 2.
// Test Data: array = 50, -20, 0, 30, 40, 60, 10 o/p: false
import java.util.Scanner;
class FirstLastSame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
       int lastIndex=arr.length-1;
       
        if(arr.length>=2)
        {
           for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            if(arr[0]==arr[lastIndex])
            {
                System.out.println("Same");
            }
            else
            {
                System.out.println("Not Same");
            }
        }
        else
        {
            System.out.println("Please provide length greater than equal to 2");
        }
    }
}

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         int arr[] ={50,-20,0,30,40,60,10};
//         boolean result = arr.length>=2 && arr[0]==arr[arr.length-1];
//         System.out.println(result);
        
//     }
// }