package brayocodes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Accept/Read input from terminal/console

        System.out.println("The Caesar Cipher: a commandline implementation");

        String plainText;
        int shiftKey;

        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.println("3. Exit Application");
        System.out.println(" ");

        System.out.println("Select one function from menu to proceed ie input 1,2 or 3");

        int selection = scanner.nextInt();
        scanner.nextLine();

        if (selection == 1){
            System.out.println("Provide message to Encrypt: ");
            plainText = scanner.nextLine().toUpperCase();   // Maintains Uppercase throughout the application
            System.out.println("Provide shift key: ");
            shiftKey = scanner.nextInt();

            Encoder encoder = new Encoder(plainText,shiftKey);
            System.out.println(String.format("Input message was: %s", encoder.getUserInput()));
            System.out.println(String.format("Encrypted message is: %s", encoder.encrypt()));
        }
        else if (selection == 2){
            System.out.println("Provide message to Decrypt: ");
            plainText = scanner.nextLine().toUpperCase();
            System.out.println("Provide shift key: ");
            shiftKey = scanner.nextInt();

            Decoder decoder = new Decoder(plainText,shiftKey);
            System.out.println(String.format("Input message was: %s", decoder.getUserInput()));
            System.out.println(String.format("Decrypted message is: %s", decoder.decrypt()));
        }
        else if (selection == 3){
            System.out.println("See you soon");
        }
        else {
            System.out.println("Invalid menu selection, Restart Application");
        }
    }
}
