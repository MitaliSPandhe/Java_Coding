class fibonacci
{
 public static void main(String args[])
 { 
    int temp,a=0,b=1;
    for(int i=1;i<=10;i++)
    {
        System.out.print(a+" ");
        temp = a + b;
        a = b;
        b = temp;
    }
    
 }
 
}