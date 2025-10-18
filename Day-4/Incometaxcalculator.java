
import java.util.Scanner;

public class Incometaxcalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your enter salaray:");
         int salary = sc.nextInt();
        if (salary <= 500000) {
            int saldata = salary * 10 / 100;
            System.out.println("Add 10% tax: " + (salary - saldata));
        } else if (salary > 500000 && salary <= 1000000) {
            int saldata = salary * 20 / 100;
            System.out.println("Add 20% tax: " + (salary - saldata));
        } else {
            int saldata = salary * 30 / 100;
            System.out.println("Add 30% tax: " + (salary - saldata));
        }
        System.out.println("Thanks  for using this calculator:");
    }
}
