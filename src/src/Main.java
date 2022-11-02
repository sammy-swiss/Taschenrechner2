import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner benutzerEingabe = new Scanner(System.in);
        int Zahl;

        do {
            System.out.println("Geben Sie eine Zahl ein");
            while (!benutzerEingabe.hasNextInt()) {
                System.out.println("Das ist keine Zahl");
                benutzerEingabe.next();
            }
            Zahl = benutzerEingabe.nextInt();
        } while (Zahl <= 0);
        System.out.println("Danke, wir arbeiten also mit dieser Zahl: " + Zahl);
        System.out.println("Was sollen wir mit der Zahl machen?");



    }
}