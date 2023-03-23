import java.util.Scanner;

public class Program_Hello_World {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Podaj swoje imię: ");
        name = scanner.nextLine();
        System.out.print("Hello " + name);
    }
}
