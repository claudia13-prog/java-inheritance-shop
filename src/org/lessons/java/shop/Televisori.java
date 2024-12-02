package org.lessons.java.shop;

public class Televisori extends Prodotto{
    //attributi
    private int pollici;
    private String smart;

    //metodi

    //costruttore
    public Televisori(int codice, String nome, String marca, double prezzo, double iva, int pollici, String smart){
        super(codice, nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.smart = smart;
    }


}
