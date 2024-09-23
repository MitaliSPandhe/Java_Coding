class commonElements
{
    public static void main(String args[])
    {   
        int arr[] = new int[]{1,2,3,4,5,6};
        int arr1[] =new int[]{7,8,3,9,2,10};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr1.length; j++)
            {
                if(arr[i]==arr1[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}