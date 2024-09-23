class MinMax
{
    public static void main(String args[])
    {
        int arr[] ={1,2,3,4,5,6,7,8,9};

       int min=arr[0];
       int max=arr[0];

       for(int i=0; i<arr.length; i++)
       {
         if(arr[i]>max)
         {
            max=arr[i];
         }
         if(arr[i]<min)
         {
            min=arr[i];
         }
       }
       System.out.println(min);
       System.out.println(max);

    }
}


//

class Solution 
{
    static Pair getMinMax(long a[], long n)  
    { 
        
        long min=a[0];
        long max=a[0];
        
        for(int i=1; i<n;i++)
        {
            if(a[i]<min)
            {
               min=a[i]; 
            }
            if(a[i]>max)
            {
               max=a[i]; 
            }
        }
         return new Pair(min, max);
    
 }
}