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
public class Cerchio extends Forma {

    private double raggio;

    public Cerchio(Colore col, double raggio) {
        super(col);
        this.raggio = raggio;
    }

    @Override
    public double getArea() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raggio;
    }

    @Override
    public String toString() {
        return super.toString() + " (raggio=" + raggio + ")\n";
    }
}
