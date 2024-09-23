//9. Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;
class Example9
{
    public static void main(String args[])
    {
        int arr1[] ={6,7,3,4,9,0,12,45,67};

        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String arr2[] ={"java","c++","flutter","html"};
         System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));



    }
}