package warengruppen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Warengruppen {
    
private Map<String, Map> waren = new HashMap<>();
public Map<String, Map> getWaren(){
    return waren;
}
    public Warengruppen() {

        
        Map<String, Cases> cases = new HashMap<>();

        cases.put("ID 1", new Cases("hersteller", "typ", "format", 1));
        waren.put("ID 1", cases);

        Map<String, CPU> cpu = new HashMap<>();
        cpu.put("ID 1", new CPU("hersteller","typ","Sockel",1800,1));
        waren.put("ID 2", cpu);

        Map<String, Cooling> cooling = new HashMap<>();
        cooling.put("ID 3", new Cooling("hersteller","Typ",80,1));
        
        
        Map<String,HDD> hdd = new HashMap<>();
        
        Map<String,Mainboards> mainboard = new HashMap<>();
        
        Map<String,Power> power = new HashMap<>();
        
         Map<String,RAM> ram = new HashMap<>();
        
        public Map<String, waren

        System.out.println("waren hat aktuell: " + waren.size() + " Elemente");

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
