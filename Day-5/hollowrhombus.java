public class hollowrhombus
{ public static void hollowrhombus(int n)
{
  // outer loop
  for(int i=1;i<=n;i++)
  {
    //Space
    for(int spc=1;spc<=(n-i);spc++)
    {
     System.out.print(" ");
    }
    for(int str=1;str<=n;str++)
    {
        if(i==1||i==n||str==1||str==n)
        {
            System.out.print("*");
        }
        else
        {    
            System.out.print(" ");
        }
    }
    System.out.println();
  }
}
    public static void main(String[] args) {
        System.out.println("hell");
        hollowrhombus(4);
    }
}