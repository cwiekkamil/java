package zajecia2;
import zajecia2.pojazdy.*;
import java.awt.*;
import java.util.*;
/**
 *
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rower r=new rower(3,Color.red,4);
        
        System.out.println("rower o " + r.liczba_przerzut + "przerzutek");
        
        rower [] tab = new rower[2];
        for(int i=0; i<tab.length; i++)
                 System.out.println("tab o " + i + tab[i]);
        
        tab[0]=r;
        tab[1]=new rower(2,Color.black,6);
        
         for(int i=0; i<tab.length; i++)
                 System.out.println("tab o index " + i + " " + tab[i]);       
        
      Arrays.sort(tab);
      
         for(int i=0; i<tab.length; i++)
                 System.out.println("tab o index " + i + " " + tab[i]);  
      
    
    }
    }
    
}
