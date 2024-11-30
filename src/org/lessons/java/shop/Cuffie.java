package org.lessons.java.shop;

public class Cuffie extends Prodotto{
    // attributi
    private String colore;
    private boolean wireless;

    //metodi

    //costruttore
    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless){
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public static void main(String[] args){
        Cuffie airpods = new Cuffie(51233, "Airpods", "Apple", 200.00, 10.00, "rosa", true);

        System.out.println(airpods.getPrezzoBase());
        System.out.println(airpods.getPrezzoConIva());
        System.out.println(airpods.colore);

    }

}
