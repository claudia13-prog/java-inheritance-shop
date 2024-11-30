package org.lessons.java.shop;

public class Smartphone extends Prodotto{

    //attributi
    private int imei;
    private int memoria;

    //metodi

    //costruttore
    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, int imei, int memoria){
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }
    
}
