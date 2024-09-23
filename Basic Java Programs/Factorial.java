import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        int fact=1,n;
        System.out.println("Enter number: ");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         for(int i=1;i<=n;i++){
            fact=fact*i;
         }
         System.out.println(fact);
    }
}

// import java.util.Scanner;

// class factorial
// {
//     public static void main(String args[]){

//         int n,f=1;
//         System.out.print("enter the number");
//         Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }
//         System.out.print("Factorial: "+f);
//     }
// }