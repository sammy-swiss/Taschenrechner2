public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Geben Sie eine Zahl ein");
        Scanner benutzerEingabe = new Scanner(System.in);
        int Zahl = benutzerEingabe.nextInt();
        System.out.println("Gehts jetzt bei euch?");

        System.out.println(Zahl);

    }
}