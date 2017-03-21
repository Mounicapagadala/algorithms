class maxarray
{
 public static void main(String ar[])
 {
  double a[]={1.1,2.2,3.3,4.4,5.5};
  double max=a[0];
  for(int i=0;i<a.length;i++)
  {
   if(a[i]>max)
   max=a[i];
  }
 System.out.println(max);
 }
}  