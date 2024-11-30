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


    public static void main(String[] args){
        Televisori televisore = new Televisori(526153, "Smart TV", "Samsung", 600.00, 15.00, 50, true);

        System.out.println(televisore.getPrezzoBase());
        System.out.println(televisore.getPrezzoConIva());
        System.out.println(televisore.smart);

    }
}
