import java.util.Scanner;

public class Primzahlen {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Startzahl ein: ");
        int startzahl = eingabe.nextInt();
        System.out.print("Bitte geben Sie die Anzahl ein: ");
        int anzahl = eingabe.nextInt();

        while (anzahl > 0) {
            int zahl = startzahl;
            if ( istPrimzahl(zahl) ) {
                System.out.println(zahl);
                anzahl--;
            }
            startzahl++;
        }
    }

    private static boolean istPrimzahl(int zahl) {
        for (int teiler = 2; teiler < zahl; teiler++) {
            if (zahl % teiler == 0) {
                return false;
            }
        }
        return true;
    }
}
