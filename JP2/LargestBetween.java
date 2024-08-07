//4. Write a Java program to get the largest value between the first and last elements of an array(length 3) of
// integers.
// Original Array: [20, 30, 40]
// Larger value betweenfirst and last element: 40
class LargestBetween
{
    public static void main(String args[])
    {
        int a[] ={20,30,40,20,10};

        int lastIndex= a.length-1;
        if(a[0]>a[lastIndex])
        {
            System.out.println("a[0] is greater"+" "+a[0]);
        }
        else{
             System.out.println("a[lastIndex] is greater"+" "+a[lastIndex]);
        }
    }

}