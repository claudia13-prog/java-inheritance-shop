package org.lessons.java.shop;

public class Televisori extends Prodotto{
    //attributi
    private int pollici;
    private String smart;
    private Schermo schermo;


    //metodi

    //costruttore
    public Televisori(int codice, String nome, String marca, double prezzo, double iva, int pollici, String smart, Schermo schermo){
        super(codice, nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.smart = smart;
        this.schermo = schermo;
    }

    //override
    public double getPrezzoScontato(){
        if(this.smart.equals("No")){
            double prezzoConIva = super.getPrezzoConIva();
            return prezzoConIva - (prezzoConIva * 10 / 100);
        }else{
            return super.getPrezzoScontato();
        }
           
    }


}
