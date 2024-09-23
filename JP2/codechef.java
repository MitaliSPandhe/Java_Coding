// Search an element in an array
// You are given an array A of size X. Your task is to find whether the array A contains the element X or not.
// Input Format
// The first line contains two space-separated integers N and X — the size of array and the element to be searched.
// The second line contains all the elements of array A
// Output Format
// Output "YES" if the element 
// X is present in A, otherwise output "NO".
// Sample 1:
// Input
// Output
// 5 3
// 7 3 5 2 1
// YES
// Sample 2:
// Input
// Output
// 5 10
// 7 3 5 2 1
// NO

import java.util.*;
import java.lang.*;
import java.io.*;

class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int arr[] = new int[N];
	    for (int i = 0; i < N; i++) 
	    { 
            arr[i] = sc.nextInt();
        }
		
		
	boolean	result = contains(arr,X);
	if(result==true)
	{
	    System.out.println("Yes");
	}
	else{
	    System.out.println("NO");
	}
		
	}
	public static boolean contains(int arr[],int X)
	{
	    for(int i=0; i<arr.length; i++)
		{
		    if(arr[i]==X)
		    {
		        return true;
		    }
		}
		return false;
	}
}
