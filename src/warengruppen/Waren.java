package warengruppen;

/**
 *
 * @author CC-Student
 */
public class Waren extends Warengruppen {
    protected int anzahlLager;
    public void verkaufen(){
        anzahlLager--;
    }    
    public void einkaufen(){
        anzahlLager++;
    }
 protected double preis;
 public void kostet(){
     
 }
}

  