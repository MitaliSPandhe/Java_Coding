//6. Write a Java program to find the largest element betweenthe first, last, and middle valuesin an array of
// integers(evenlength).
// Original Array: [20, 30, 40, 50, 67]
// Largest element betweenfirst, last, and middle values: 67

class EvenlengthLargest
{
    public static void main(String args[])
    {
        int a[] ={20,30,40,50,60};
        int middleIndex = a[a.length/2];
        int lastIndex= a.length-1;
         if(a[0]>a[lastIndex] && a[0]>a[middleIndex])
        {
            System.out.println("a[0] is greater"+" "+a[0]);
        }
        else if(a[lastIndex]>a[middleIndex])
        {
             System.out.println("a[lastIndex] is greater"+" "+a[lastIndex]);
        }
        else
        {  
            System.out.println("a[middleIndex] is greater"+" "+a[middleIndex]);

        }
        }
    }

