class MissingNo
{
    public static void missingNumber(int arr[],int size)
    {
        int i;
        int temp[]=new int[size+1];

        for(i=0;i<=size;i++)
        {
            temp[i] = 0;

        }
        for(i=0;i<size;i++)
        {
            temp[arr[i]-1] = 1;
            
        }
        int ans=0;
        for(i=0;i<=size;i++)
        {
            if(temp[i]==0)
            {
                ans = i+1;
            }
            
        }
        System.out.print(ans+" ");


    }
    public static void main(String args[])
    {
        int arr[]={1,3,5,6,7};
        int n=arr.length;

        missingNumber(arr,n);
    }

}