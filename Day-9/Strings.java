
public class Strings {

    public static void printlatters(String strvalue) {
        int totalvowels = 0;
        for (int i = 0; i < strvalue.length(); i++) {
            if (strvalue.charAt(i) == 'a' || strvalue.charAt(i) == 'e' || strvalue.charAt(i) == 'i' || strvalue.charAt(i) == 'o' || strvalue.charAt(i) == 'u') {
                System.out.println(strvalue.charAt(i));
                totalvowels++;
            }
        }
        System.out.println("Total vowels is:" + totalvowels);
        System.out.println("Total char is :" + strvalue.length());
    }

    public static void main(String[] args) {
        // String str = "Neeraj";
        // String strnew = new String("abcx");
        // System.out.println("New string" + strnew);
        // System.out.println("Hello:" + str);
        // System.out.println("Hello");
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();
        // System.out.print(name);
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();   // takes one word as input
        // System.out.print(name);

        // find the lenght of array;
        //  String  str="Neeraj kumar singh";
        //  System.err.println(" Str length:"+str.length());
        // Concatenatio
        //String  Name="Neeaj";
        //String lastname="Kumar";
        //String fullName= Name+""+lastname;
        //System.out.println("Full name is :"+fullName);
        // CharAt
        String str = "Neeraj kumar";
        // System.out.println("use of charAt:"+str.charAt(3));
        printlatters(str);
    }
}
