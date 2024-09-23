// 41.Write a program to separate 0s and 1s in an array of 0s and 1s into left and right sides.
// Input Format
// First line contain size of array second line contain all the input array elements containing mix of 0 and 1
// Output Format
// Print all the array element where 0s will be left and 1s will be right
import java.io.*;
import java.util.*;

public class Seprate01{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0; i<size; i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            arr[i]=0;
        }
        for(int i=count;i<size;i++)
        {
            arr[i]=1;
        }
        for(int i=0;i<size;i++)
        {
           System.out.print(arr[i]); 
        }
    }
}

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int j=0;
//         for(int i=0;i<size;i++)
//         {
//             if(arr[i]==0)
//             {
//                 arr[j++]=0;
//             }     
//         }
//         while(j<size)
//         {
//             arr[j++]=1;
//         }
//         for(int i=0;i<size;i++)
//         {
//              System.out.println(arr[i]);
//         }
       
//     }
// }