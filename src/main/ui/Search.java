package ui;

import java.util.Scanner;

public class Search {
    private String entry;
    private Scanner scanner;
    private String name;

    public Search() {
        entry = "";
        scanner = new Scanner(System.in);
        name = "";
        operations();
    }

    private void operations() {
        String entry;
        String name;

        System.out.println("Welcome! Please input your name below:");
        name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.println("Search for your desired amenity below. Type 'Exit' to leave the app.");
        entry = scanner.nextLine();

        while (!(entry.equals("Exit"))) {
            System.out.println("Please find the " + entry + " here:");
            System.out.println("Search for your desired amenity below. Type 'Exit' to exit the app.");
            entry = scanner.nextLine();
        }

        System.out.println("Thank you " + name + ". Come again!");
    }

    public static void main(String[] args) {
        new Search();
    }

    //Used the LittleLoggingCalculator as a reference for some of the code
}