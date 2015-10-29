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
public class InkJetPrinter {

    private static final int MAXLEVEL = 1000;
    private int cartridge[];

    public InkJetPrinter() {
        this.cartridge = new int[Colore.values().length];
        initCartridges();
    }

    private void initCartridges(){
        for (Colore c : Colore.values()) {
            this.cartridge[c.ordinal()] = MAXLEVEL;
        }
    }
    public void changeCartridge(Colore c) {
        this.cartridge[c.ordinal()] = MAXLEVEL;
    }

    public void stampa(ImgVett img) {
        for (Colore c : Colore.values()) {
            this.cartridge[c.ordinal()] -= img.getSommaAree(c);
        }
    }
    
    public void getCartridgesLeve(){
        System.out.println("Livelli delle cartucce");
        for(Colore c : Colore.values()){
            System.out.println(Colore.valueOf(c.name()) + " " + cartridge[c.ordinal()]);
        }
        System.out.println("");
    }
}
