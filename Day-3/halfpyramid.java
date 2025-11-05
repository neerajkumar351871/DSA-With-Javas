public class halfpyramid {
    public static void halfpyramid() {
        int n = 4;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //space
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            //Star
            for (int str = 1; str <= i; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        halfpyramid();
    }
}
