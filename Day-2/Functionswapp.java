
public class Functionswapp {

    public static void swappaing(int a, int b) {
        int tem = a;
        a = b;
        b = tem;
        System.out.println("A:" + a + "  " + "B:" + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("A:" + a + "  " + "B:" + b);
        swappaing(a, b);

    }
}
