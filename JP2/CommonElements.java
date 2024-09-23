import java.util.HashSet;
import java.util.Arrays;

class CommonElements
{   
    public static void main(String args[])
    {
    int arr[] ={1,2,3,4,5,6,8,9};
    int arr1[]={1,2,3,4,5,6,7};
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<arr.length;i++)
    {   
        for(int j=0;j<arr1.length;j++)
        {
           if(arr[i]==arr1[j])
           {
            hs.add(arr[i]);
            break;
           }
        }
    }
    for(int no:hs)
    {
        System.out.print(no +" ");
    }

    }

}