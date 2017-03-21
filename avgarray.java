class avgarray
{
 public static void main(String[] ar)
 {
  int a[]={1,2,3,4,5};
  int sum=0;
  int n=a.length;
    for(int i=0;i<n;i++)
     {
       sum=sum+a[i];
     }
  System.out.println(sum/n);
  }
}