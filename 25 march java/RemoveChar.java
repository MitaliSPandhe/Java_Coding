import java.util.Scanner;
class RemoveChar
{

   public static String removeChar(String str, int n)
 {
    StringBuffer ans = new StringBuffer();

    for (int i = 0; i < n; i++) 
    {
      int ascii = (int) str.charAt(i);

      if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) 
        ans.append(str.charAt(i));
    }

    return ans.toString();
  }
  public static void main(String args[]) {
    String str = "Hello @good #morning *hel$lo";
    int n = str.length();

    System.out.println(removeChar(str, n));
  }
}
