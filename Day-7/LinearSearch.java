
public class LinearSearch {

    public static boolean LinearSearch(int arrry[], int key) {
        boolean flage = false;
        for (int i = 0; i < arrry.length; i++) {
            if (arrry[i] == key) {
                flage = true;
            }

        }
        return flage;
    }

    public static int LinearIndexSearch(int arrry[], int key) {

        for (int i = 0; i < arrry.length; i++) {
            if (arrry[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arrry[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;
        // boolean result = LinearSearch(arrry, key);
        // if (result) {
        // System.out.println("Value avaliable in array:" + key);
        // } else {
        // System.out.println("Value not  avaliable in array:" + key);
        // }
        int index = LinearIndexSearch(arrry, key);
        if (index == -1) {
            System.out.println("Not found:" + index);
        } else {
            System.out.println("Index is found:" + index);
        }

    }
}
