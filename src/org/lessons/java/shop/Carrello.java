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

                if(prodottoScelto.equals("Smartphone")){
                    Smartphone smartphone = new Smartphone(124152, "iphone", "Apple", 800.00, 22.0, 24335430, 8);
                    carrello.add(smartphone);

                }else if(prodottoScelto.equals("Televisore")){
                    Televisori televisore = new Televisori(5463435, "smart tv", "Samsung", 900.00, 22.00, 50, true);
                    carrello.add(televisore);

                }else if(prodottoScelto.equals("Cuffie")){
                    Cuffie cuffie = new Cuffie(65732738, "airpods", "Apple", 200.00, 22.00, "rosa", true);
                    carrello.add(cuffie);

                }

            }else if(scelta.equals("No")){
                System.out.println("Vai al carrello");
                
                for(Prodotto prodotto : carrello){
                    System.out.println(prodotto.getNome() + " $" + prodotto.getPrezzoConIva());
                }
                break;
                }



        }


        


    }

}
