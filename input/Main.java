import java.util.Scanner;

public class  Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int number = scanner.nextInt();
        System.out.println("Name: ");
        String age = scanner.nextLine();
        System.out.println("You are: " + age);
    }
}