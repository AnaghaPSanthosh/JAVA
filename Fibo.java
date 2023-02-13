import java.util.Scanner;
public class Fibo
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int t1=0,t2=1,sum=0;
    
    System.out.print(t1+"\t"+t2+"\t");
    for(int i=2;i<=10;i++)
    {
      sum=t1+t2;
      t1=t2;
      t2=sum;
      System.out.print(t2+"\t");
    }
    
   }
   

}