import java.util.Scanner;

public class Primzahlen {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int zahl = eingabe.nextInt();

        byte b = 127;
        System.out.println("Mein Byte: " + b);
        b++;
        System.out.println("Mein Byte: " + b);

        // typische Aufbau von for-Schleifen
        for (int i=0, j=7, k=-15; i < 10 && j > 0 && k < 10; i++, j+=2, k-=3) {
            System.out.println("Mein Index: " + i + ", " + j + ", " + k);
        }

        for (byte i=10; i > 0; ++i) {
            System.out.println("Der andere Index: " + i);
        }

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
