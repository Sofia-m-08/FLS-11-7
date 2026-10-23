package Noten;
import java.unit.Scanner;

public class SchulNoten {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        int zahl;
        System.out.println("Was hast du für ne Note:");
        zahl scanner = scanner.next();
        switch(zahl) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            System.out.println("Befrieden");
            break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            case 6:
            System.out.println("Ungenügend");
                break;
            default:
                System.out.println("Keine gültige Note");
        }
    }
}