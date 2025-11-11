public class Reversearray {
    public static void Reversearray(int array[]) {
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        Reversearray(array);

        System.out.println("Reversed array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
