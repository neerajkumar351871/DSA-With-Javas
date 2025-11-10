public class array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int compare = 5;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == compare) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Value is in the array");
        } else {
            System.out.println("Value is not in the array");
        }
    }
}
