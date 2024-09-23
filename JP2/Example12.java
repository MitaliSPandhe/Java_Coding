//13.Write a Java program to find the index of an array element
class Example12
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7};
        int searchElement = 6;
        int index = contains(arr,searchElement);
        
        if(index==-1)
        {
            System.out.println("Not found");
        }
        else
        { 
            System.out.println("Element s at index " + index);
        }
    }
    public static int contains(int arr[], int searchElement)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==searchElement)
            {
               return i;
            }
        }
        return -1;
    }
}