import java.util.Collections;
import java.util.Arrays;
class Anagram
{
    public static boolean checkAnagram(char[] str,char[] str1)
    {
        int n1 =str.length;
        int n2 = str1.length;

        if(n1 != n2)
        {
          return false;
        }
      Arrays.sort(str);
      Arrays.sort(str1);

      for(int i=0; i<n1; i++)
      {
        if(str[i] != str1[i])
        {
            return false;
        }
        
      }
      return true;

    }
    public static void main(String args[])
    {
        char str[]={'a','b','e','d'};
        char str1[]={'b','a','d','c'};

        if(checkAnagram(str,str1))
        {
            System.out.println("The two strings are Anagram");
        }
        else
        {
            System.out.println("The two strings are not Anagram");
        }

    }
}