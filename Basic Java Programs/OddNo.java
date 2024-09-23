//Print odd number in given range and print their sum
import java.util.Scanner;
class OddNo{
    public static void main(String args[]){
        int n,s=0;
        System.out.println("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
      for(int i=1;i<=n;i=i+2){
            System.out.print(i);
            s=s+i;
        }
         System.out.print(" Addition of Numbers: "+s);
    }
}