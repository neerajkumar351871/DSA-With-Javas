
public class hollowpattern {

    public static void hollowpattern(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                    // System.out.print("("+(i)+""+(j)+")");
                } else {
                    System.err.print(" ");
                    //Count space value
                    // System.out.print("("+(i)+""+(j)+")");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowpattern(4, 5);
    }
}
