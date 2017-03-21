import java.io.*;
class prime1
{
 public static boolean isPrime(int n)
  {
     if(n<2)
     return false;
     for(int i=2;i*i<=n;i++)
     if(n%i==0)
    return false;
    return true;
   }
   public static void main(String ar[]) throws IOException
 { 
  prime1 a=new prime1();
   boolean b=a.isPrime(15);
   if(b==true)
  {
   System.out.println("prime");
  }
 else
  {
   System.out.println("not prime");
  }
}
}