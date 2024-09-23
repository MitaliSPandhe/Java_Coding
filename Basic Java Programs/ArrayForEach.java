import java.util.Scanner;
class ArrayForEach{
    public static void main(String args[]){
        int a[]=new int[5];
        System.out.print("Enter a Elements of array: ");
        Scanner sc=new Scanner(System.in);

        for(int b:a){
           b=sc.nextInt();
           System.out.print(b+" ");
        }
        
        // for(int i=0;i<a.length;i++){
        //    a[i]=sc.nextInt();
        // }
    
        // for(int i=0;i<a.length;i++){
        //    System.out.print(a[i]+" ");
        // }
    }
}