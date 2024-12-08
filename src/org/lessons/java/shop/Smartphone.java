package org.lessons.java.shop;

public class Smartphone extends Prodotto{

    //attributi
    private int imei;
    private int memoria;
    private Processore processore;
    private Schermo schermo;

    //metodi

    //costruttore
    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, int imei, int memoria, Processore processore, Schermo schermo){
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
        this.processore = processore;
        this.schermo = schermo;
    }



    //override
    public double getPrezzoScontato(){
        if(this.memoria < 32){
            double prezzoConIva = super.getPrezzoConIva();
            return prezzoConIva - (prezzoConIva * 5 / 100);
        }else{
            return super.getPrezzoScontato();
        }
       
    }


    public static void main(String[] args){

        Smartphone smartphone = new Smartphone(0, "iphone", null, 0, 0, 0, 0, null, null);
        Prodotto prodotto = new Prodotto(0, "prodotto", null, 0, 0);


        System.out.println(smartphone.getNome());
        System.out.println(prodotto.getNome());

    }
    
}
