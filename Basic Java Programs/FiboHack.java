//WAP that takes number n as input and print nth no in fibonacci series
import java.util.Scanner;
class FiboHack{
    public static void main(String args[]){
        int n,a=0,b=1,c;
         Scanner sc=new Scanner(System.in);
      System.out.print("Enter the nth number: ");
       n=sc.nextInt();
        if(n==0)
        {
            System.out.print(a);
        }
        else{
             for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
          }      
            System.out.print(b);
        }
       
    }
}