/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacce;

import java.util.Arrays;

/**
 *
 * @author cristiana
 */
public class ImgVett implements Comparable<ImgVett> {

    private static final int MAXEL = 10;
    private Forma[] elementi;
    private int n;

    public ImgVett() {
        elementi = new Forma[MAXEL];
        n = 0;
    }

    public void addComponente(Forma f) {
        if (n < MAXEL) {
            elementi[n++] = f;
        }
    }

    public double getSommaAree() {
        double s = 0;
        for (Forma m : elementi) {
            if (m != null) {
                s += m.getArea();
            }
        }
        return s;
    }

    public double getSommaAree(Colore c) {
        double s = 0;
        for (Forma m : elementi) {
                if (m != null && m.getColore() == c) {
                    s += m.getArea();
            }
        }
        return s;
    }

    @Override
    public String toString() {
        /* prima della stampa si ordinano i componenti grafici per colore */
        Arrays.sort(elementi, 0, n);
        String s = "";
        for (Forma f : elementi) {
            if (f != null) {
                s += f;
            } 
        }
        return s;
    }

    @Override
    public int compareTo(ImgVett o) {
        if (this.getSommaAree() < o.getSommaAree()) {
            return -1;
        } else if (this.getSommaAree() > o.getSommaAree()) {
            return +1;
        }
        return 0;
    }

}
