import java.util.Scanner;
class Character{
    public static void main(String args[]){
        char ch;
        System.out.println("Enter any Character: ");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println("Character: "+ch);
    }
}