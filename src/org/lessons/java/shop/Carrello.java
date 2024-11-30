package org.lessons.java.shop;
import java.util.Scanner;
import java.util.ArrayList;


public class Carrello {

    public static void main(String[] args){
        // creo un array carrello dove inserirò i prodotti aggiunti
        ArrayList<Prodotto> carrello = new ArrayList<Prodotto>();

        //chiedo all'utente di scegliere un prodotto
        Scanner scanner = new Scanner(System.in);
        String scelta = "Si";

        while(scelta.equals("Si")){

            System.out.println("Vuoi aggiungere un prodotto al carrello?");
            scelta = scanner.nextLine();

            if(scelta.equals("Si")){
                System.out.println("Scegli tra Smartphone, Televisore o Cuffie");
                String prodottoScelto = scanner.nextLine();

            }else if(scelta.equals("No")){
                System.out.println("Vai al carrello");
                break;
                }

        }


        


    }

}
