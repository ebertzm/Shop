package kunden;

public class Kunden {

    //Attribute
    private String name;
    private String vorname;
    /**
     * enthält den Betrag in €, den der Kunde bezahlen muss
     */
    private double rechnung;
    private boolean darfKontaktiertWerden;

    //Methoden
    public void nameEingeben(String kundenName) {
        name = kundenName;

    }

    public void vornameEingeben(String kundenVorname) {
        vorname = kundenVorname;

    }

    public void bezahlen() {
        System.out.println("Die Rechnung beträgt aktuell " + rechnung + "€");
        rechnung = 0;
    }

    public void darfKontaktiertWerden() {
        //soll sagen of er kontaktiert werden darf
        //bezahlen
    }

    public String ausgabeName() {
        return vorname +" "+ name;
        
    }
}
