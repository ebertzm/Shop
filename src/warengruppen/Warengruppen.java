package warengruppen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

        
public class Warengruppen{
   
   
    public void waren() {
       
    
    

    Collection waren = new ArrayList();
    Collection cases = new ArrayList();
    waren.add (cases);
    Collection cpu = new ArrayList();
    waren.add (cpu);
    Collection cooling = new ArrayList();
    waren.add (cooling);
    Collection hdd = new ArrayList();
    waren.add (hdd);
    Collection mainboard = new ArrayList();
    waren.add(mainboard);
    Collection power = new ArrayList();
    waren.add (power);
    Collection ram = new ArrayList();
    waren.add (ram);
     
    System.out.println("waren hat aktuell: "+waren.size()+" Elemente");

     }

    
   
    public void bestellen(int id) {
        Scanner eingabe = new Scanner(System.in);
    
        int kundeHatGewaehlt = eingabe.nextInt();
        switch (id) {
            case 1: {
                System.out.println("CPU");
                //   System.out.println(warengruppen.Warengruppen);
                break;
            }

            case 2: {
                System.out.println("Cases");

                break;
            }
            case 3: {
                System.out.println("Cooling");

                break;
            }
            case 4: {
                System.out.println("HDD's");

                break;
            }
            default: {
                System.out.println("Haben wir im Moment nicht im Programm, dürfen wir dich kontaktieren, wenn es etwas neues gibt?");
                //Vieleicht boolean ändern daftKontaktiert werden
                break;
            }
      }
   }
}
