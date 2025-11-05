public  class halfpyramidNumber
{  
     public static void halfpyramidNumber(int n){
    for(int i=0;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(j);
        }
        System.out.println("");
    }
}
    public static void main(String[] args) {
         halfpyramidNumber(5);
    }   
}