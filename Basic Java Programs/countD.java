import java.util.Scanner;

class countD
{
    public static void main(String args[])
    {
        int count=0,n;
        System.out.print("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.print(count);
    }

}

// import java.util.Scanner;
// class Count{
//     public static void main(String args[]){
//         int digit,count=0;
//         System.out.println("Enter digits: ");
//         Scanner sc=new Scanner(System.in);
//         digit=sc.nextInt();

//         while(digit!=0){
//             digit=digit/10;
//             count++;  
//         }
//         System.out.print("Number of digits: "+count);
//     }
// }