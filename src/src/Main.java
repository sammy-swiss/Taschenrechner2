import src.src.Rechnen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rechnen rn = new Rechnen();

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

        String rechenart;
        rechenart = benutzerEingabe.next();

        switch(rechenart){
            case "addieren":
                System.out.println("Welche Zahl soll zu " +Zahl +" addiert werden?");
                int ZahlAdd = benutzerEingabe.nextInt();
                System.out.println("Das Ergebnis ist: " + rn.addition(Zahl, ZahlAdd));
                break;

            case "subtrahieren":
                System.out.println("Welche Zahl soll von " +Zahl +" subtrahiert werden?");
                int ZahlSub = benutzerEingabe.nextInt();
                System.out.println("Das Ergebnis ist: " + rn.dekrement(Zahl, ZahlSub));
                break;

            case "multiplizieren":
                System.out.println("Mit welcher Zahl soll " + Zahl + " multipliziert werden?");
                int ZahlMulti = benutzerEingabe.nextInt();
                System.out.println("Das Ergebnis ist: " + rn.faktor(Zahl, ZahlMulti));
                break;

        }

    }
}