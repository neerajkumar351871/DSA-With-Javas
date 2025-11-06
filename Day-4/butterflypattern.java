public class butterflypattern {
    public static void butterflypattern(int n) 
    {
        //str
 
        //outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // str
            for (int str = 1; str <= i; str++) {
                System.out.print("*");
            }
            // space
            for (int spc = 1; spc <= 2 * (n - i); spc++) {
                System.out.print(" ");
            }
            //str
            for (int str = 1; str <= i; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // inner loop
            // str
            for (int str = 1; str <= i; str++) {
                System.out.print("*");
            }
            // space
            for (int spc = 1; spc <= 2 * (n - i); spc++) {
                System.out.print(" ");
            }
            //str
            for (int str = 1; str <= i; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterflypattern(5);
    }
}
