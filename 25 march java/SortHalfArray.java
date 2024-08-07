import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class SortHalfArray
{
    public static void main(String args[])
    {
       // ******************** take size*******************************
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
       int size = sc.nextInt();

       if(size==0)
       {
        System.out.print("Array size should be greater than 0");
        System.exit(0);
       }
      // ******************** elemnets half n1 and half n2*******************************
       int n1 = (size%2==0)?(size/2):(size/2-1);
       int n2 = size-n1;

       ArrayList<Integer> first=new ArrayList<>();
       ArrayList<Integer> second=new ArrayList<>();

      // ********************elements*******************************
       System.out.print("Enter elemnets");

       for(int i=0;i<n1;i++)
       {
        first.add(sc.nextInt());
       }
       for(int i=0;i<n2;i++)
       {
        second.add(sc.nextInt());
       }
     //  ******************** Sorting******************************
       Collections.sort(first);        //ascending
       Collections.sort(second,Collections.reverseOrder()); //descending
       
       for(int i=0;i<n1;i++)
       {
       System.out.print( first.get(i)+" ");
       }
       for(int i=0;i<n2;i++)
       {
       System.out.print (second.get(i)+" ");
       }


    }
}