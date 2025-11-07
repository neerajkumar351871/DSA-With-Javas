
public class Practicequestion {

    public static void Righthalfpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void lefthalfpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int spc = 1; spc <= (n - i); spc++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void fullpyramid(int n) {
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

        }
    }

    public static void invertedlefthalfpyramid(int n) {
        //outer loop
        for (int i = 1; i < n; i++) {
            // inner loop
            // space 
            for (int spc = 0; spc < i; spc++) {
                System.out.print(" ");
            }
            //str
            for (int str = 1; str <= (n - i); str++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

  public static void invertedhalfpyramid(int n) {

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // stars   (decreasing)
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8;
        //  Righthalfpyramid(n);
        //lefthalfpyramid(n);
        // fullpyramid(n);
      invertedhalfpyramid(n);
    }
}
