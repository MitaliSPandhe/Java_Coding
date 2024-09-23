import java.util.Arrays;
class InsertElement
{
    public static void main(String args[])
    {
        int arr[] ={1,2,3,4,5,6};
        int elementToInsert=7;
        int IndexPosition=2;

        int newarr[] = new int[arr.length+1];

        for(int i=0; i<IndexPosition;i++)      //Spacing
        {
            newarr[i]=arr[i];
        }
        newarr[IndexPosition]=elementToInsert;   //newarr[2]=7  INSERTION
        for(int i=IndexPosition;i<arr.length;i++)     //Spacing
        {
            newarr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(newarr));


    }
}