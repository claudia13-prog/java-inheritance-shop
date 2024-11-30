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
    
    public static void main(String[] args){
        Smartphone iphone = new Smartphone(1234, "Iphone", "Apple", 1200.00, 20.00, 5267162, 8);

        System.out.println(iphone.getPrezzoBase());
        System.out.println(iphone.getPrezzoConIva());
        System.out.println(iphone.getNome());
        System.out.println(iphone.imei);



    }
}
