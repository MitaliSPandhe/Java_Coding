//11.Write a Java program to test if an array contains a specific value.
// Write a program to test if an array contains a specific value.
// Input Format
// First line contain size of array second line contain all the input array elements third line contain element to be search
class SearchElement
{
    public static void main(String args[])
    {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int searchElement = 10;

     boolean result = containsValue( arr,searchElement);
     System.out.println(result);

    }
    public static boolean containsValue(int arr[], int searchElement)
    {
       for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==searchElement)
            {
              return true;
            }
        }
        return false;
    }
}

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[]= new int[size];
//          for(int i=0; i<arr.length; i++)
//          {
//              arr[i] = sc.nextInt();
//          }
//         int elementSearch = sc.nextInt();
//         boolean result =contains(arr,elementSearch);
//         System.out.println(result);
//     }
//      public static boolean contains(int arr[],int elementSearch){   
//         for(int i=0; i<arr.length; i++)
//         {
//             if(arr[i]==elementSearch)
//             {
//                 return true;
//             }
//         }
//         return false;   
//     }
    
// }

// import java.io.*;
// import java.util.*;

// public class Solution {
//      public static boolean contains(int arr[],int elementSearch)
//     {   
//         for(int i=0; i<arr.length; i++)
//         {
//             if(arr[i]==elementSearch)
//             {
//                 return true;
//             }
//         }
//         return false;
        
//     }

//     public static void main(String[] args)
//     {  Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[]= new int[size];
//      for(int i=0; i<arr.length; i++)
//      {
//          arr[i] = sc.nextInt();
//      }
//         int elementSearch = sc.nextInt();
//         boolean result =contains(arr,elementSearch);
//         System.out.println(result);
//     }
   
//  }

