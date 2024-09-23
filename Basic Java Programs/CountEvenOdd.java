class CountEvenOdd
{
    public static void CountingEvenOdd(int arr[],int size)
    {
        int even =0;
        int odd =0;

        for(int i=0;i<size;i++)
        {
            if((arr[i]%2==0))
            {
                even++;
            }
            else
            {   odd++;
            }
        }
        System.out.println("Number of Even elements: "+even);
        System.out.println("Number of Odd elements: "+odd);
    }



    public static void main(String args[])
    {
        int arr[]={2,3,4,6,5,7,13};
        int n = arr.length;

        CountingEvenOdd(arr,n);
    }
}

// // JAVA program to count number of even 
// // and odd elements in an array 
// import java.io.*; 

// class odd { 

//     static void CountingEvenOdd(int arr[], int arr_size) 
//     { 
//         int even_count = 0; 
//         int odd_count = 0; 

//         // loop to read all the values in 
//         // the array 
//         for (int i = 0; i < arr_size; i++) { 
            
//             // checking if a number is 
//             // completely divisible by 2 
//             if ((arr[i] %2) == 0) 
//               even_count++;
                
//             else
//                 odd_count++;  
//         } 

//         System.out.println("Number of even"
//                         + " elements = " + even_count 
//                         + " Number of odd elements = "
//                         + odd_count); 
//     } 

//     // Driver Code 
//     public static void main(String[] args) 
//     { 
//         int arr[] = { 2, 3, 4, 5, 6 }; 
//         int n = arr.length; 
            
//         // Function Call 
//         CountingEvenOdd(arr, n); 
//     } 
// } 
