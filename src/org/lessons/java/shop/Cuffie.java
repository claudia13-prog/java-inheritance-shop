package org.lessons.java.shop;

public class Cuffie extends Prodotto{
    // attributi
    private String colore;
    private String wireless;

    //metodi

    //costruttore
    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, String wireless){
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    //override
    public double getPrezzoScontato(){
        if(this.wireless.equals("No")){
            double prezzoConIva = super.getPrezzoConIva();
            return prezzoConIva - (prezzoConIva * 7 / 100);
        }else{
            return super.getPrezzoScontato();
        }
    }

}
