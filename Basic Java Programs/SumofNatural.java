import java.util.Scanner;
class SumofNatural{
    public static void main(String args[]){
    int n,s=0;
    System.out.println("Enter number: ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        s=s+i; 
    }
    System.out.print(s);
 } 
}