/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inkJetprinter;

/**
 *
 * @author cristiana
 */
public class TestFoto {

    public static void main(String[] args) {

        Foto fotos[] = new Foto[3];
        for (int i = 0; i < fotos.length-1; i++) {
            fotos[i] = new Foto(i+3, Colore.BLUE);
        }
        fotos[fotos.length-1]=new Foto(randompixels(4));
        
//        System.out.println(fotos[1]);
        
        System.out.println("Immagini");
        for (Foto foto : fotos) {
            System.out.println(foto);
        }        
    }
    
    private static Colore[][] randompixels(int n){
        Colore [][] pixels = new Colore[n][n];
        for (int i=0; i<n;i++) {
            for (int j=0; j<n;j++) {
                pixels[i][j] = Colore.values()[(int)Math.floor(Math.random()*3.9999)];
            }    
        }
        return pixels;
    }
}
