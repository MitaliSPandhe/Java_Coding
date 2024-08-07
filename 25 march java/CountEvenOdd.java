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