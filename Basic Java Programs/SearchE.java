import java.util.Scanner;
class SearchE
{
    public static void main(String args[])
    {    int s,count=0,i;
        int a[]=new int[]{7,4,2,9,6,7,6};
        System.out.print("Searching element: ");
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();

        for(i=0;i<a.length;i++)
        {
            if(a[i]==s)
            {
                count++;           //If more than one element present
            }

        }
        if(count>0)
        {
            System.out.print("Searching Element:"+ s+" repeated " +count+ " times");
        }
        
    }
}