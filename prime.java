import java.io.*;
class prime
{
 public static void main(String ar[]) throws IOException
 {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter a number");
   String s=br.readLine();
   int n=Integer.parseInt(s);
   int count=0;
   for(int i=1;i<=n;i++)
    { 
      if(n%i==0)
      count++;
    }
   if(count==2)
   {
     System.out.println("prime number");
   }
   else
   {
    System.out.println("not prime number");
   }
 }
}