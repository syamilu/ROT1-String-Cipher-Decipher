// Assignment 2 : String Cipher & Decipher
// Name: Wan Muhammad Syamil bin W Mohd Yusof
// Matric No : 2220561
// Section : 2
// Lecturer's Name : Ts. Dr. Muhamad Sadry Abu Seman

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to String Cipher Decipher");
        StringCipherDecipher cipher = null;
        do {
            System.out.println("1. Cipher");
            System.out.println("2. Decipher");
            System.out.println("3. Exit");
            System.out.print("Choose your option : ");
            int option = input.nextInt();
            input.nextLine();
            System.out.println();
            switch (option) {
                case 1:
                    System.out.println("Enter text to cipher : ");
                    String text = input.nextLine();
                    cipher = new StringCipherDecipher(text);
                    System.out.println("\nCiphered text : \n" + cipher.cipher());
                    break;
                case 2:
                    System.out.println("Ciphered text : ");
                    System.out.println(StringCipherDecipher.getText());
                    System.out.println("\nDeciphered text : ");
                    if (StringCipherDecipher.getIsCiphered()) {
                        System.out.println(cipher.decipher());
                    } else {
                        System.out.println("Invalid!");
                    }

                    break;
                case 3:
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            System.out.println("\n====================================\n");

        } while (true);

    }
}
