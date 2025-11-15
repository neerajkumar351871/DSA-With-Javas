
public class checkpal {

    public static boolean Palindrone(String str) {
        for (int i = 0; i <= str.length()/2; i++) {
            if ((str.charAt(i)) == (str.charAt(str.length()-i-1))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "noon";
        boolean result;
        result = Palindrone(name);
        if (result) {
            System.out.println("String is palindrone:" + name);
        } else {
            System.out.println("String is  not palindrone:" + name);

        }

    }
}
