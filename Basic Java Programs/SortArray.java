class SortArray
{
    public static void main(String args[])
    {
        int a[]=new int[]{8,4,89,56,32,90,12};
        int temp=0,i,j;
        
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
         
    }
}