package zajecia2.pojazdy;
import java.awt.*;

public class rower extends pojazd implements Comparable {
    public int liczba_przerzut;
    public rower() {
       
        this (2,Color.yellow,1);
    }
    
    public int compareTo(Object o) {
        return this.liczbakol - ((rower)o).liczbakol;
    }
    
    
    public rower(int liczba, Color k, int liczba_przerzut){
        super (liczba,0,k);
        this.liczba_przerzut=liczba_przerzut;
    }
    
    public int spalanie(){
        return 0;
    }
    
    
    public String toString() {
        return "rower, kola: "+liczbakol+" rzuty:"+liczba_przerzut;
        
    }
    
      public static Comparator k=new Comparator() {
public int compare(Object o1,Object o2)           {
 return ((rower)o1).liczba_przerzut -  ((rower)o2).liczba_przerzut;
}
          
      };
    
    
    
}
