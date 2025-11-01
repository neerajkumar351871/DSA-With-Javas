
public class Functionpara {

    // With parameter no retrun value.
    public static void sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        System.out.println("Addation of two numbers:" + sum);
    }

    // No parameter no  return value
    public static void printhello() {
        System.out.println("Hello");
    }

    // No parameter  return value
    public static int sums() {
        int sum = 0;
        sum = 10 + 20;
        return sum;
    }
    // With parameter   with return value

    public static int sumss(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        sum(a, b);
        printhello();
        int res;
        res = sums();
        System.out.println("Addation of to numbers:" + res);
        int result;
        result = sumss(a, b);
        System.out.println("Addation of to numbers:" + result);

    }
}
