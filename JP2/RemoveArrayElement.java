//13. Write a Java program to remove a specific elementfrom an array.
// Write a program to remove a specific element from an array.
// Input Format
// First line contain size of array Second line contain all the input array elements third line contain element to be remove
class RemoveArrayElement
{
    public static void main(String args[])
    {
        int a[] ={1,2,3,4,5,6};
        int pos = 5;
        
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==pos)
            {
                pos=i;
                break;
            }
        }
        for(int i=pos+1; i<a.length; i++ )
         {
            a[i-1] = a[i];
         }  
         for(int i=0; i<a.length-1; i++)
        {
            System.out.print(a[i]);
        }
    //     for(int i=pos+1; i<a.length; i++ )
    //     {
    //         a[i-1] = a[i];
    //     }
    //     for(int i=0; i<a.length-1;i++)
    //     {
    //         System.out.print(a[i]);
    //     }
    }
}

// Write a program to remove a specific element from an array.
// Input Format
// First line contain size of array Second line contain all the input array elements third line contain element to be remove
// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0; i<arr.length; i++)
//         {
//             arr[i] =sc.nextInt();
//         }
//         int removeElement = sc.nextInt();
//         for(int i=0;i<size; i++)
//         {
//             if(arr[i]== removeElement)
//             {
//                removeElement =i;
//                 break;
//             }
//         }
//         for(int i=removeElement+1; i<size;i++)
//         {
//             arr[i-1]=arr[i];
//         }
//         for(int i=0;i<size-1; i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
