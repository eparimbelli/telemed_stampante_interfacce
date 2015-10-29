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

    }
}
