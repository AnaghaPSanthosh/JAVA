import java.util.*;
public class largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers to be compared: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
              {
                System.out.println("The largest is "+a);
              }
              else
              {
                System.out.println("The largest is "+c);
              }
        }
        else
        {
                 if(b>c)
              {
                System.out.println("The largest is "+b);
              }
              else
              {
                System.out.println("The largest is "+c);
              }
        }

        
    }
}