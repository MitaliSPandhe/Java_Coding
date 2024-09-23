import java.util.Scanner;
class power{
    public static void main(String args[]){
        int p,n,resu=1;
        System.out.print("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("enter the power");
        p=sc.nextInt();

        for(int i=1;i<=p;i++){
           resu = resu*n;
        }
        System.out.print("the power of number is"+ resu);
    }
}


//5^2=5*5=25
import java.util.Scanner;
class Power{
    public static void main(String args[]){
         int n,p,result=1;
         System.out.println("Enter number: ");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         System.out.println("Enter Power: ");
         p=sc.nextInt();

         for(int i=1;i<=p;i++){
            result=result*n;
         }
          System.out.println(result);

    }
}