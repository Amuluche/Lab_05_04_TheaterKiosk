//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = Scanner.nextInt();

        if (age < 21) {
            System.out.println("You do not get a paper wrist band");
        }else if (age >= 21) {
            System.out.println("You get a paper wrist band");
        }
    }
}