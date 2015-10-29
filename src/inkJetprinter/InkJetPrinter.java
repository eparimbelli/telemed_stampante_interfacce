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

    private final int MAXLEVEL;
    private int cartridge[];

    public InkJetPrinter(int cartridgeCapacity) {
        this.MAXLEVEL = cartridgeCapacity;
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

    public void stampa(Printable itemToPrint) {
        for (Colore c : Colore.values()) {
            this.cartridge[c.ordinal()] -= itemToPrint.getNeededInk(c);
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
