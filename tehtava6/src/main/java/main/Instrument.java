package main;

public class Instrument {
    protected String mannufacturer;
    protected int price;

    public Instrument(String manufacturer, int price){
        this.mannufacturer = manufacturer;
        this.price = price;
    }

    public String getDetails(){
        String text = "Valmistaja: "+mannufacturer+", Hinta: "+price+"e";
        return text;
    }
    
}
