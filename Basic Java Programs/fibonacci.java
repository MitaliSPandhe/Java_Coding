import java.util.Scanner;
class fibonacci
{  
    public static void main(String args[]){
     int n,a=0,b=1,c;

    System.out.println("Enter n value: ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    
    for(int i=0;i<=n;i++)
    {
        System.out.print(a + " ");
        c = a+b;
        a = b;
        b = c;
     
    }
    

    }
    
}

// class fibonacci
// {
//  public static void main(String args[])
//  { 
//     int temp,a=0,b=1;
//     for(int i=1;i<=10;i++)
//     {
//         System.out.print(a+" ");
//         temp = a + b;
//         a = b;
//         b = temp;
//     }
    
//  }
 
// }

import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
        int term,a=0,b=1,c;

        System.out.println("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        term=sc.nextInt();

        for(int i=0;i<=term;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;  
        }
    }
}