
public class invertpattern {

    public static void main(String[] args) {
        int no = 7;
        for (int i = 1; i <= no; i++) {
            for (int j = no-i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
