//3. Write a program to rotate an array of integers in the left direction by 1 position
// Input Format
// 20, 30, 40
// Output Format
// 30, 40, 20

import java.io.*;
import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[6];
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
       if(arr==null||arr.length==0)
        {
            return;
        }
        int firstElement=arr[0];
        for(int i=0; i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElement;
       
            System.out.println(Arrays.toString(arr));
      
     
    }
  }