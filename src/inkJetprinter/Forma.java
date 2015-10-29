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
public abstract class Forma implements Misurabile, Comparable<Forma> {

    private Colore colore;

    public Forma(Colore col) {
        this.colore = col;
    }

    public Colore getColore() {
        return colore;
    }

    @Override
    public int compareTo(Forma o) {
        return this.colore.compareTo(o.colore);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +" " + this.getColore().name()+ " area="+Util.format(this.getArea());
    }

}
