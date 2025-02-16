package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        ArrayList<Instrument> Instruments = new ArrayList<>();

        while(exit != true) {
            System.out.println("1) Lisää soitin"); 
            System.out.println("2) Listaa soittimet"); 
            System.out.println("3) Viritä kielisoittimet"); 
            System.out.println("4) Soita rumpuja"); 
            System.out.println("0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");
                        int selectInstrument = Integer.parseInt(sc.nextLine());

                        System.out.println("Anna valmistajan nimi:");
                        String instrumentManufacturer = sc.nextLine();
                        System.out.println("Anna hinta euroina:");
                        int insturmentPrice = Integer.parseInt(sc.nextLine());

                        if(selectInstrument == 1){
                            Guitar guitar = new Guitar(instrumentManufacturer, insturmentPrice);
                            Instruments.add(guitar);
                            System.out.println("Soitin lisätty listaan!");
                        }
                        else if(selectInstrument == 2){
                            Violin violin = new Violin(instrumentManufacturer, insturmentPrice);
                            Instruments.add(violin);
                            System.out.println("Soitin lisätty listaan!");   
                        }
                        else if(selectInstrument == 3){
                            Drum drum = new Drum(instrumentManufacturer, insturmentPrice);
                            Instruments.add(drum);
                            System.out.println("Soitin lisätty listaan!"); 
                        }
                        else{
                            System.out.println("Virheellinen soitinvalinta.");
                        }
                        break;
                        
                    case 2:
                        if(Instruments.size()>0){
                            for(Instrument j : Instruments){
                                System.out.println(j.getDetails());
                            }
                        }
                        else{
                            System.out.println("Ei lisättyjä soittimia.");
                        }
                        break;
                    case 3:
                        for(Instrument j : Instruments){
                            if(j instanceof StringInstrument){
                                StringInstrument k = (StringInstrument) j;
                                k.tune();
                        }
                    }
                        break;
                    case 4:
                        for(Instrument j : Instruments){
                            if(j instanceof Drum){
                                Drum k = (Drum) j;
                                k.playBeat();
                            }
                        }
                        break;
                    case 0:
                        exit=true;
                        break;
                }
            }    
        }
    sc.close();
    System.out.println("Kiitos ohjelman käytöstä.");
    }
}
