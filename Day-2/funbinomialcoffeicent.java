public class funbinomialcoffeicent {
 public static int Factoriol(int num) {
        int fact = 1;
        for (int i = 1; i < num + 1; i++) {
            fact *= i;
    }
        return fact;
        }
     public static void BinomialCofficient(int n, int r) {
         int number = Factoriol(n);
        int ratio = Factoriol(r);
        int n_r = Factoriol(n - r);
        int result = number / (ratio * n_r);
        System.out.println("BinomialCofficient :" + result);
    }
    public static void main(String[] args) {

        int n = 5, r = 2;
        BinomialCofficient(n, r);

    }
}
