public  class chracterpattern
{
    public static void main(String[] args) {
        char chr='A';
        int no=6;
         for (int i = 1; i <= no; i++) {
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+chr);
                chr++;
            }
            System.out.println();
        }
    }
}