import java.util.Scanner;
public class Prime
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int no=sc.nextInt();
    int count=-1;
    for(int i=2;i<=(no/2);i++)
    {
      if((no%i)==0)
      {
         count=0;
         break;
      }
    }
    if(count==-1)
    System.out.println("No is prime");
    else
     System.out.println("No is not prime");
   }
   

}