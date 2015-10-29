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
public class Quadrato extends Forma implements Comparable<Forma> {

    private double lato;

    public Quadrato(double lato, Colore col) {
        super(col);
        this.lato = lato;
    }

    @Override
    public double getArea() {
        return lato * lato;
    }

    @Override
    public double getPerimetro() {
        return 4 * lato;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (lato=" + lato + ")\n";
    }
}
