public class Replace0with1
{   
    int replace(int num)
    {   
        int ans=0,temp=1;
        if(num==0)
        {
            return 1;
        }
        while(num>0)
        {
            int d =num % 10;
            if(d==0)
            {
                d=1;
            }
            ans = d *temp+ans;
            num = num/10;
            temp = temp*10;
        }
        return ans;

    }


    public static void main(String args[])
    {
       int num=204;
       Replace0with1 r=new Replace0with1();
       System.out.print("Original:"+num+" "+"replaced: "+r.replace(num)); 
    
    }
}