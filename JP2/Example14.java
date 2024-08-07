//15. Write a Java program to copy an array by iterating the array
class Example14
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        int brr[] = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
             brr[i] = arr[i];
           System.out.println(brr[i]);
            }
           
        }
        
    }
}