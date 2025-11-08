import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program generates a hash for any passeord.");

        Scanner scan = new Scanner(System.in);

        System.out.println("\nPlease enter your password: ");
        String password = scan.nextLine().trim();

        String hash = generateHash(password);
        System.out.println("The hashed password was " + hash);
    }

    public static String generateHash(String password) {
        Random generator = new Random();

        String hash = "";
        for (int i = 0; i < password.length(); i++) {
            int random = 1 + generator.nextInt(26);
            char c = (char) ('A' + random - 1);
            hash += c;
        }
        return hash;
    }
}