// 7. Write a Java program tomultiply the corresponding elements of two integer arrays.
// Array1:[1, 3, -5, 4]
// Array2: [1, 4, -5,-2]  Result: 1 12 25 -8

class MultiplyArray7
{
    public static void main(String args[])
    {
        int Array1[] ={1,3,-5,4};
        int Array2[] ={1,4,-5,-4};

        int Array3[] = new int[4];

        for(int i=0; i<Array1.length; i++)
        {
            Array3[i] = Array1[i] * Array2[i];
        }
          for(int i=0; i<Array3.length; i++)
        {
           System.out.println(Array3[i]);
        }
    }
}