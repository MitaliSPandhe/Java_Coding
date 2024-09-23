import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        int rem=0,rev=0,n;
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
       int temp=n;
        while(n!=0)
        {
            rem = n%10;
            rev= (rev*10)+rem;
            n = n/10;

        }
        if(rev==temp)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
        
    }
}

// import java.util.Scanner;
// class palindrome{
//     public static void main(String args[]){
//         int n,c,s=0,r;
//         System.out.print("enter the number");
//         Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();
//         c=n;

//         while(n>0){
//             r=n%10;
//             s=(s*10)+r;
//             n=n/10;

//         }
//         if(c==s)
//         {
//             System.out.print("palindrome");
//         }
//         else{
//             System.out.print("Not palindrome");
//         }
//     }
// }

// import java.util.Scanner;
//  class Palindrome{
//     public static void main(String args[]){
//         int n ,temp,s=0;
//         System.out.println("Enter number: ");
//         Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();
//         temp=n;

//         while(n>0){
//             int remainder=n%10;  // 121%10==1   12%10==2    1%10==1
//             s=(s*10)+remainder;  // 0*10+1==1   1*10+2==12  12*10+1==121
//             n=n/10;              // 121/10==12  12/10==1    1/10==0
//         }
//         if(temp==s){
//             System.out.print("palindrome");
//         }
//         else{
//             System.out.print("not palindrome");
//         }
//     }
//  }
