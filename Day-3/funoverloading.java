public class funoverloading
{
   public static void add(int a,int b)
   {
    int sum=a+b;
    System.out.println("Addation of numbers:"+sum);
   }
   public static void add(int a,int b,int c)
   {
      float sum=a+b+c;
    System.out.println("Addation of numbers:"+sum);
   }
   public static void main(String[] args) {
       int a=10,b=20;
       add(a, b);
       add(a, b, b);
   }
}