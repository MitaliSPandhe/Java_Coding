import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
    {
         int temp=0,n,r,c;
         System.out.print("Enter number: ");
         Scanner sc =new Scanner(System.in);
         n=sc.nextInt();
         c=n;
        while(n>0)
        {
        r = n % 10;
        temp = (r*r*r)+ temp;
        n= n/10;
        }

        if(c==temp)
        {
            System.out.print("Armstrong");
        }
        else
        {
            System.out.print("Not Armstrong");
        }

    }
}

// class ArmstrongNo {

//     public static void main(String[] args) {

//         int num = 370, number, temp, total = 0;

//         number = num;
//         while (number != 0)
//         {
//             temp = number % 10;
//             total = total + temp*temp*temp;
//             number /= 10;
//         }

//         if(total == num)
//             System.out.println(num + " is an Armstrong number");
//         else
//             System.out.println(num + " is not an Armstrong number");
//     }
// }
// class Armstrong
// {
//     public static void main(String args[])
//     {
//         int n=548834,s=0;
//         int temp=n;     //Stored orginal value 
//         int count=0;
//         while(n!=0)
//         {
//             count++;
//             n=n/10;
//         }
//         n=temp;           //Reset n
//         while(n!=0)
//         {
//           int d = n % 10;
//             s = s + (int)Math.pow(d, count);
//             n = n / 10;
//         }
//         if(temp==s)
//         {
//             System.out.print("Arm");
//         }
//         else
//         {
//             System.out.print("Not Arm");
//         }
//     }
// }