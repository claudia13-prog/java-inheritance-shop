package org.lessons.java.shop;

public class Prodotto {

    //variabili d'istanza
    private int codice;  
    private String nome;  
    private String marca;
    private double prezzo;
    private double iva;

    //metodi

    //costruttore
    public Prodotto(int codice, String nome, String marca, double prezzo, double iva){
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // getter per codice prodotto (accessibile solo in lettura)
    public int getCodice(){
        return this.codice;
    }

    // getter e setter per nome (accessibile sia in lettura che in scrittura)
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // getter e setter per marca (accessibile sia in lettura che in scrittura)
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    // getter e setter per prezzo (accessibile sia in lettura che in scrittura)
    public double getPrezzo(){
        return this.prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    // getter e setter per iva (accessibile sia in lettura che in scrittura)
    public double getIva(){
        return this.iva;
    }

    public void setIva(double iva){
        this.iva = iva;
    }

    //metodo per avere il prezzo base
    public double getPrezzoBase(){
        return this.prezzo;
    }

    //metodo per avere il prezzo comprensivo di iva formattato
    public double getPrezzoConIva(){
        return this.prezzo + (this.prezzo * iva / 100);
    }

    //BONUS
    //metodo per il calcolo del prezzo scontato per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%
    public double getPrezzoScontato(int sconto){
        double prezzoConIva = this.prezzo + (this.prezzo * iva / 100);
        return prezzoConIva - (prezzoConIva * sconto / 100);
    }



}
