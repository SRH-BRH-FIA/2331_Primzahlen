import java.util.Scanner;

public class Primzahlen {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int zahl = eingabe.nextInt();

        // Verarbeitung
        int teiler;
        for ( teiler = 2 ; teiler < zahl ; teiler++ ) {
            if ( zahl % teiler == 0 ) {
                System.out.println("Die Zahl ist keine Primzahl.");
                System.out.println("Folgender Teiler wurde gefunden: " + teiler);
                break;
            }
        }
        if ( teiler == zahl )
            System.out.println("Die Zahl ist eine Primzahl");
    }
}
