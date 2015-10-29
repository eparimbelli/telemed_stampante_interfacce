/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inkJetprinter;

/**
 *
 * @author enea
 * I'm assuming only square (1:1) aspect ratio fotos are allowed in this implementation
 */
public class Foto implements Printable{
    private Colore[][] pixels;
    
    public Foto(int n) {
        /* creates a nxn all-black image */
        this.pixels = new Colore[n][n];
        for (int i=0; i<n;i++) {
            for (int j=0; j<n;j++) {
                pixels[i][j] = Colore.BLACK;
            }    
        }
    }

    public Foto(Colore[][] pixels) {
        this.pixels = pixels;
    }

    @Override
    public double getNeededInk(Colore c) {
        double s = 0;
        for (Colore[] pixelrow : pixels) {
            for (Colore pixelunit : pixelrow) {
                if (pixelunit != null && pixelunit == c) {
                    s += 1; /*found a pixel of color c*/
                }
            }    
        }
        return s;
    }

    @Override
    public String toString() {
        String result =  "Foto[\n";
            for (Colore[] pixelrow : pixels) {
                for (Colore pixelunit : pixelrow) {
                    result += pixelunit+";\t";
                } 
                result += "\n";
        }
        result += "]";
        return result;
    }
    
    
}