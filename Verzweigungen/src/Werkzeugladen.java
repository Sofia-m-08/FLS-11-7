import java.util.Scanner;
public class Werkzeugladen {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl Schrauben: ");
        int schrauben = scanner.nextInt();

        System.out.print("Anzahl Muttern: ");
        int muttern = scanner.nextInt();

        System.out.print("Anzahl Unterlegscheiben: ");
        int scheiben = scanner.nextInt();

        int gesamtCent = schrauben * 5 + muttern * 3 + scheiben * 1;

        if (schrauben > muttern) {
            System.out.println("Kontrollieren Sie Ihre Bestellung!");
        } else {
            System.out.println("Die Bestellung ist okay.");
        }

        int euro = gesamtCent / 100;
        int cent = gesamtCent % 100;
        System.out.println("Gesamtbetrag: " + euro + " Euro und " + cent + " Cent");
    }
}