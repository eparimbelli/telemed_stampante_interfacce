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
public class TestPrinter {

    public static void main(String[] args) {
        InkJetPrinter printer = new InkJetPrinter(1000);

        ImgVett images[] = new ImgVett[3];
        for (int i = 0; i < images.length; i++) {
            images[i] = new ImgVett();
        }

        images[0].addComponente(new Rettangolo(Colore.RED, 1, 1));
        images[0].addComponente(new Rettangolo(Colore.BLUE, 2, 1));
        images[0].addComponente(new Cerchio(Colore.BLACK, 1));
        images[0].addComponente(new Rettangolo(Colore.YELLOW, 5, 3));

        images[1].addComponente(new Cerchio(Colore.BLACK, 3));
        images[1].addComponente(new Cerchio(Colore.BLACK, 4));
        images[1].addComponente(new Rettangolo(Colore.BLUE, 2, 2));
        images[1].addComponente(new Cerchio(Colore.YELLOW, 4));

        images[2].addComponente(new Rettangolo(Colore.YELLOW, 2, 6));
        images[2].addComponente(new Rettangolo(Colore.BLUE, 3, 4));

        printer.getCartridgesLeve();
        for (ImgVett img : images) {
            System.out.println("-----------------");
            System.out.println("stampa in corso\n" + img);
            printer.stampa(img);
            printer.getCartridgesLeve();
        }
        
        //Let's print Fotos too! NOTE: on a new printer with bigger cartridges
        
         System.out.println("-----NEW PRINTER------");
        InkJetPrinter fotoPrinter = new InkJetPrinter(2000);
        fotoPrinter.getCartridgesLeve();
        
        Foto fotos[] = new Foto[3];
        for (int i = 0; i < fotos.length-1; i++) {
            fotos[i] = new Foto(i+3, Colore.BLUE);
        }
        fotos[fotos.length-1]=new Foto(randompixels(4));
        for (Foto pic : fotos) {
            System.out.println("-----------------");
            System.out.println("stampa in corso\n" + pic);
            fotoPrinter.stampa(pic);
            fotoPrinter.getCartridgesLeve();
        }
        
        System.out.println("-----Finally print also an ImgVett with the second printer------");
        System.out.println("stampa in corso\n" + images[0]);
        fotoPrinter.stampa(images[0]);
        fotoPrinter.getCartridgesLeve();
        
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
