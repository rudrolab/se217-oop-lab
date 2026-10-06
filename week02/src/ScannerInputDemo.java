import java.util.Scanner;

public class ScannerInputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        int id = input.hasNextInt() ? input.nextInt() : 584;

        System.out.print("Enter your CGPA: ");
        double cgpa = input.hasNextDouble() ? input.nextDouble() : 3.85;

        input.nextLine();

        System.out.print("Enter your name: ");
        String name = input.hasNextLine() ? input.nextLine() : "Rudro";
        if (name.isEmpty()) name = "Rudro";

        System.out.println("\n--- User Details ---");
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Name: " + name);

        input.close();
    }
}
