
public class Largestarray {

    public static int Largestarray(int array[]) {
        int largestvalue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (largestvalue < array[i]) {
                // Updation largest value;
                largestvalue = array[i];
            }
        }
        return largestvalue;
    }

    public static int smallestvalue(int array[]) {
        int smallestvalue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (smallestvalue > array[i]) {
                smallestvalue = array[i];
            }
        }
        return smallestvalue;

    }

    public static void main(String[] args) {
        int number[] = {1, 2, 6, 8, 9};
        int Largestvalue = Largestarray(number);
        System.out.println("Largest Value is :" + Largestvalue);
        int smallestvalue = smallestvalue(number);
        System.out.println("Smallest value is:" + smallestvalue);
    }
}
