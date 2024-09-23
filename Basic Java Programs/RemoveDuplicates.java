import java.util.Scanner;
import java.util.HashMap;

class RemoveDuplicates
{
    public static void main(String args[])
    {
        int duplicates[] = {1,1,2,2,3,4,4,5,6};

        HashMap<Integer,Integer> hasmap=new HashMap<Integer,Integer>();

        for(int i=0; i<duplicates.length; i++)
        {
            hasmap.put(duplicates[i],i);
        }      
        System.out.print(hasmap.keySet());  
    }
}