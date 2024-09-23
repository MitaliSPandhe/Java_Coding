import java.util.Scanner;
class Swapping
{  
    public static void main(String args[]){
     int temp,a,b;

    System.out.println("Enter a and b value: ");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();

        temp=a;
        a = b;
        b = temp;
        System.out.print(a+ " "+ b +" ");
     
    
    

    }
    
}



import java.util.Scanner;
class Swapping{
    public static void main(String args[]){
        int a,b,temp;
        System.out.println("Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
       System.out.println("before swapping: "+a+" "+b);
          temp=a;       //temp=34            // a=a+b;
          a=b;           //a=45              // b=a-b;
          b=temp;        //b=34              // a=a-b;
       System.out.println("after swapping: "+a+" "+b);
    }
}