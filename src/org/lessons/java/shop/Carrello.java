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

        //variabili che deve scegliere l'utente default
        int memoriaScelta = 0;
        String prodottoScelto = "";
        String isSmart = "";
        String isWireless = "";

        //oggetti
        Processore processore1 = new Processore();
        Schermo display = new Schermo();


        while(scelta.equals("Si")){

            System.out.println("Vuoi aggiungere un prodotto al carrello?");
            scelta = scanner.nextLine();

            if(scelta.equals("Si")){
                System.out.println("Scegli tra Smartphone, Televisore o Cuffie");
                prodottoScelto = scanner.nextLine();

                if(prodottoScelto.equals("Smartphone")){
                    System.out.println("Scrivi la quantità di memoria dello smartphone desiderata");
                    memoriaScelta = scanner.nextInt();
                    scanner.nextLine();
                    Smartphone smartphone = new Smartphone(124152, "iphone", "Apple", 800.00, 22.0, 24335430, memoriaScelta, processore1, display);
                    carrello.add(smartphone);

                }else if(prodottoScelto.equals("Televisore")){
                    System.out.println("Vuoi che sia smart?");
                    isSmart = scanner.nextLine();
                    Televisori televisore = new Televisori(5463435, "smart tv", "Samsung", 900.00, 22.00, 50, isSmart, display);
                    carrello.add(televisore);

                }else if(prodottoScelto.equals("Cuffie")){
                    System.out.println("Vuoi le cuffie wireless?");
                    isWireless = scanner.nextLine();
                    Cuffie cuffie = new Cuffie(65732738, "airpods", "Apple", 200.00, 22.00, "rosa", isWireless);
                    carrello.add(cuffie);

                }

            }else if(scelta.equals("No")){

                System.out.println("Hai la tessera fedeltà?");
                String isLoyalty = scanner.nextLine();

                if(isLoyalty.equals("No")){
                    System.out.println("Vai al carrello:");
                
                    for(Prodotto prodotto : carrello){
                        System.out.println(prodotto.getNome() + " $" + prodotto.getPrezzoConIva());
                    }
                    
                }else if(isLoyalty.equals("Si")){
                    System.out.println("Vai al carrello:");

                    for(Prodotto prodotto : carrello){
                            System.out.println(prodotto.getNome() + " $" + prodotto.getPrezzoScontato());
                        }


                    }
                 
                }
        
                
                
                //break;
            }

            
        scanner.close();



        }

    

        


    }


