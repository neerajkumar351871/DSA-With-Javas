public  class halfpyramidpattern
{
   public static void main(String[] args) {
       int no = 4;
        for (int i = 1; i <= no; i++) {
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
   } 
}