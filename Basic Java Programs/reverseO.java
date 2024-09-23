import java.util.Collections;
import java.util.ArrayList;
class reverseO
{   
    
    public static void main(String args[])
    {
       ArrayList<Integer> arr=new ArrayList<>(); 
       arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       arr.add(5);
       arr.add(6);
    
    int i=0,j= arr.size()-1;
    while(i<=j)
    {
      Collections.swap(arr,i,j);
       i++;
       j--;
    }
    System.out.print(arr);    
    }
}