package shop;

import java.util.Arrays;
import java.util.Scanner;
import kunden.Kunden;
import warengruppen.Warengruppen;

public class Shop {

    public static void main(String[] args) {

        // TODO code application logic here
        String nameDesShops = "Michas Hardwarebude";

        Scanner eingabe = new Scanner(System.in);
        //Begrüßung

        System.out.println("Hallo Willkommen in " + nameDesShops + ", wie heißt du?");
        Kunden kunde1 = new Kunden();
        System.out.println("Nachname:");
        kunde1.nameEingeben(eingabe.nextLine());
        System.out.println("Vorname:");
        kunde1.vornameEingeben(eingabe.nextLine());

        {
            System.out.println("schön dass du da bist " + kunde1.ausgabeName() + ", möchtest du eine Auswahl der Produkte sehen? " + "1=ja 2=nein");

            int produktWahl = eingabe.nextInt();

            //Produktwahl    
            int ja = 1;
            int nein = 2;
            {

                if (produktWahl == 1) {

                    String[] warengruppen = {"1 CPU","2 Cases","3 Cooling", "4 HDD", "5 Mainboard","6 Power", "7 RAM"};
                    // String[][] warengruppe2 = {{"Intel", "AMD"}, {"DDR3", "DDR4"}, {"HDD", "SSD"}, {"Ryzen", "i7"}, {"128GB", "256GB"}, {"8GB", "16GB", "32GB"}};

                    System.out.println( Arrays.toString(warengruppen));
                    System.out.println("wähle eine Produktgruppe:");

                } else {
                    if (produktWahl == 2) {
                        System.out.println("vielen Dank für Deinen Besuch " + kunde1.ausgabeName());
                    }

                }

            }
        }
    }
}
