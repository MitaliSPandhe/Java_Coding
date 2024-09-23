import java.util.Scanner;
class Primerange
{
    public static void main(String args[])
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        int i,j;
        for( i=n1;i<=n2;i++)          //10 t0 20
        {
            for(j=2;j<=i;j++)    //2 to 10  
            {
                if(i%j==0)       
                {
                    break;
                }
            
            }
            if(i==j)
                {
                    System.out.print(j+" ");
                }
        }
    }
}

import java.util.Scanner;
class PrimeRange{
    public static void main(String args[]){
        int n1,n2,s=0,i,j;
        System.out.print("Enter a First number: ");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        System.out.print("Enter a Second number: ");
        n2=sc.nextInt();
        for(i=n1;i<=n2;i++){
            for(j=2;j<=i;j++){
                if(i%j==0){
                    break;
                } 
            }
            if(i==j){
                System.out.print(j+" ");
            }
        }

    }
}