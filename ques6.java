public class SortArray
{
  public static void main(String[] args)
    {
      int a[]={1,1,1,1,0,0,1,0};
      int n,i,j,t;
      for(i=0;i<8;i++)
      {
        for(j=i+1;j<8;j++)
           { 
             if(a[i]>a[j])
             {
               t = a[i];
               a[i] = a[j];
               a[j] = t;
             }
           }
      }
System.out.print("Ascending order:{");
for(i=0;i<8;i++)
{
System.out.print(a[i] + ",");
}
System.out.print(a[8-i]);
System.out.print("}");
}
}
