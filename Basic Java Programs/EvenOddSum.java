class EvenOddSum
{
    public static void main(String args[])
    {
        int n=1234;
        int evenSum=0,oddSum=0;
        while(n!=0)
        {
        int digit=n%10;
        if(digit%2==0)
        {
          evenSum=evenSum+digit;
        }
        else
        {
         oddSum=oddSum+digit;
        }
        n=n/10;
        }
        System.out.print("EvenSum:"+evenSum+" "+"oddSum:"+" "+oddSum);

    }
}