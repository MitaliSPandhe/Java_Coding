//wap to accept 2no between 25 and 75 and return true if there is common digit in both number
import java.util.Scanner;
class Commondigit{
    static boolean check(){
        int a,b;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter 1st no: ");
         a=sc.nextInt();
         System.out.println("Enter 2nd no: ");
         b=sc.nextInt();
         if(a>=25&&a<=75&&b>=25&&b<=75){
            int x=a%10;
            int y=b%10;
            a=a/10;
            b=b/10;
            
            if(a==b||a==y||x==b||x==y){
               
                return true;
            }
         }
        return false;
      }
    public static void main(String args[])
    {
     System.out.println(check());
    }
}
