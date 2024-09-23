class InsertA
{
    public static void main(String args[])
    {
        
        int a[]=new int[]{32,43,67,23};
        int pos,item=0,i,size=0;
        pos=3;

        for(i=size;i>pos;i--)
        {
            a[i]=a[i-1];
        }
        a[pos]=item;
        size++;
        
        for(i=1;i<size;i++)
        {
         System.out.print(a[i]+" ");
        }
    }
}