class Largest
{
    public static void main(String args[])
    {
        int largestDigit=0;
        int n=789432;
        while(n!=0)
        {
            int digit=n%10;
            if(digit>largestDigit)
            {
                largestDigit=digit;
            } 
            n=n/10;
        }
        System.out.print(largestDigit);
    }
}