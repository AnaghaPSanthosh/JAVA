import java.util.*;
public class Reverse
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str=sc.nextLine();
    int len=str.length();
    System.out.println("-----Reverse----");
    for(int i=len-1;i>=0;i--)
    {
        System.out.print(str.charAt(i));
    }
   }
}