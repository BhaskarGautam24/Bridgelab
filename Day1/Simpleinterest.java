package Day1;
import java.util.*;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);
    }
}
