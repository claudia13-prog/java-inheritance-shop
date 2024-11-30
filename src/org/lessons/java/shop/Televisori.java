package org.lessons.java.shop;

public class Televisori extends Prodotto{
    //attributi
    private int pollici;
    private boolean smart;

    //metodi

    //costruttore
    public Televisori(int codice, String nome, String marca, double prezzo, double iva, int pollici, boolean smart){
        super(codice, nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.smart = smart;
    }


}
