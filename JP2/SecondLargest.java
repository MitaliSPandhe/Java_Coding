class SecondLargest
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8};
        int largest =Integer.MIN_VALUE;
        int second_Largest =Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
            
                second_Largest=largest;
                largest=a[i];
            }
            else if(a[i]>second_Largest && a[i]!=largest)
            {
               second_Largest=a[i];

            }
        }
        if(second_Largest==Integer.MIN_VALUE)
        {
            System.out.print("Their is no Second Largest Value");
        }
        else
        {
            System.out.print("SecondLargest= "+second_Largest);
        }
    }
}