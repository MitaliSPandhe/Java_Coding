import java.util.HashSet;
class Duplicates
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,3,5,2};
        HashSet<Integer> hs = new HashSet<>();
        for(int num:arr)
        {
            if(!hs.add(num))
            {
                System.out.print(num+" ");
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}