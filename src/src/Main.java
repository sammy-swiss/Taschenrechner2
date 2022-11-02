import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Geben Sie eine Zahl ein");
        Scanner benutzerEingabe = new Scanner(System.in);
        int Zahl = benutzerEingabe.nextInt();
        System.out.println("Gehts jetzt bei euch?");
        System.out.println("Geben Sie eine weitere Zahl ein");
        int zahl2= benutzerEingabe.nextInt();

        System.out.println(Zahl);
        System.out.println(zahl2);


    }
}