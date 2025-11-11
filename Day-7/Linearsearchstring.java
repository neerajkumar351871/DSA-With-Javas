
public class Linearsearchstring {

    public static boolean LinearIndexSearch(String fruits[], String key) {
        boolean flage = false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == key) {
                flage = true;
                break;
            }
        }
        return flage;
    }

    public static void main(String[] args) {
        String fruits[] = {"Apple", "Mango", "Grapes", "Guava"};
        String key = "Apple";
        boolean flage = LinearIndexSearch(fruits, key);
        if (flage) {
            System.out.println("Your Fruits if find:" + key);
        } else {
            System.out.println("Your Fruits if find:" + key);
        }
    }
}
