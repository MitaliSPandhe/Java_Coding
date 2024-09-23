class GreatestCD
{
    public static void main(String args[])
    {
        int n1=12,n2=8,gcd=1;
        for(int i=1; i<=n1&&i<=n2; i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
                System.out.print(gcd+" ");
                
            }
        }
        
        System.out.print(gcd);
    }
}