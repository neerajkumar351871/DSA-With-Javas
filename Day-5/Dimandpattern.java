
public class Dimandpattern {

    public static void Dimandpattern(int n) {
        //Outer  loop
        for (int i = 1; i <= n; i++) {
            // space
            for (int spc = 1; spc <= (n - i); spc++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= (2 * i) - 1; str++) {
                System.out.print("*");
            }
            System.out.println("");
            //Full Dimand pattern

        }
        for (int i = n; i >= 1; i--) {
            // space
            for (int spc = 1; spc <= (n - i); spc++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= (2 * i) - 1; str++) {
                System.out.print("*");
            }
            System.out.println("");
            //Full Dimand pattern

        }
    }

    public static void main(String[] args) {
        Dimandpattern(9);
    }
}
