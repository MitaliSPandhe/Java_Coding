import java.util.HashSet;
//For Sorted Array
class RemoveDuplicate
{
  public static void main(String args[])
  {
    int arr[] ={0,1,2,2,3,4,4,5,5,6};
    int temp[]=new int[arr.length];
    int j=0;

    for(int i=0;i<arr.length-1;i++)
    {
      if(arr[i]!=arr[i+1])
      {
        temp[j++]=arr[i];
        
      }
    }
    temp[j] =arr[arr.length-1];
    for(int i=0;i<j;i++)
    {
       System.out.print(temp[i]+" ");
    }
  }
}

//For Unsorted Array
// class RemoveDuplicate
// {
//   public static void main(String args[])
//   {
//     int arr[] ={2,3,2,2,5,6,1,0};
//     HashSet<Integer> hs=new HashSet<>();
//     for(int i=0;i<arr.length;i++)
//     { 
//        hs.add(arr[i]);
           
//     }
//     for(int no:hs)
//     {
//         System.out.print(no +" ");
//     }
//   }
// }
 