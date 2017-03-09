package zajecia2.pojazdy;
import java.awt.*;
/**
 *
 * @author poniatok
 */
abstract public class pojazd {
    int liczbakol;
    int pojemnosc;
    Color kolor;
    
    public pojazd(int liczba, int poj, Color kolor) {
        this.liczbakol=liczba;
        this.pojemnosc=poj;
        this.kolor=kolor;
    }
    
    abstract int spalanie();
    
}
