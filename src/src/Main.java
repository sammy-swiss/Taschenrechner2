import src.src.Rechnen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rechnen rn = new Rechnen();

        Scanner benutzerEingabe = new Scanner(System.in);
        double Zahl;

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
                double ZahlAdd = benutzerEingabe.nextInt();
                System.out.println("Das Ergebnis ist: " + rn.addition(Zahl, ZahlAdd));
                break;

            case "subtrahieren":
                System.out.println("Welche Zahl soll von " +Zahl +" subtrahiert werden?");
                double ZahlSub = benutzerEingabe.nextInt();
                System.out.println("Das Ergebnis ist: " + rn.dekrement(Zahl, ZahlSub));
                break;

            case "multiplizieren":
                System.out.println("Mit welcher Zahl soll " + Zahl + " multipliziert werden?");
                double ZahlMulti = benutzerEingabe.nextInt();
                System.out.println("Das Ergebnis ist: " + rn.faktor(Zahl, ZahlMulti));
                break;

            case "dividieren":
                System.out.println("Durch welche Zahl soll " + Zahl + " dividiert werden?");
                double ZahlDivi = benutzerEingabe.nextInt();
                System.out.println("Das Ergebnis ist: " + rn.division(Zahl, ZahlDivi));
                break;

        }

    }
}