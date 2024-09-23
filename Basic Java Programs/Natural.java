import java.util.Scanner;
class Natural{
    public static void main(String args[]){
        int n;
        System.out.println("Enter Number : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+ " ");
        }
    }
}