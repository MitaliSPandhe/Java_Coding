class BiggestA
{
    public static void main(String args[])
    {
        int a[]=new int[]{34,76,89,21,22};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.print("Max element: "+max+" ");
        System.out.print("Min element: "+min);
    }

}