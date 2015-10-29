/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacce;

/**
 *
 * @author cristiana
 */
public class TestImmagineVettoriale {

    public static void main(String[] args) {

        ImgVett img1 = new ImgVett();
        img1.addComponente(new Rettangolo(Colore.RED, 1, 1));
        img1.addComponente(new Rettangolo(Colore.BLUE, 2, 1));
        img1.addComponente(new Cerchio(Colore.BLACK, 1));
        img1.addComponente(new Rettangolo(Colore.YELLOW, 3, 2));
        img1.addComponente(new Cerchio(Colore.YELLOW, 3));
        img1.addComponente(new Rettangolo(Colore.YELLOW, 1, 5));
        img1.addComponente(new Cerchio(Colore.BLACK, 1));
        img1.addComponente(new Rettangolo(Colore.BLUE, 2, 1));
        img1.addComponente(new Cerchio(Colore.BLACK, 2));
        System.out.println("\noggetti grafici immagine");
        System.out.println(img1);

        System.out.println("\nArea totale immagine: " + Util.format(img1.getSommaAree()));

        for (Colore c : Colore.values()) {
            System.out.println("Area " + c.name()
                    + ": " + Util.format(img1.getSommaAree(c)));
        }
        System.out.println("\n");

    }

}
