import java.util.Scanner;
public class Fac
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int no=sc.nextInt();
    int fact=1,i=1;
    
    do{
         fact*=i;
         i++;
    }while(i<=no);
    
    System.out.println("Factorial: "+fact);
    
   }
   

}