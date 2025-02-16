package main;

public class StringInstrument extends Instrument {

    protected int numberOfStrings;

    public StringInstrument(String manufacturer, int price, int numberOfStrings){
        super(manufacturer, price);
        this.numberOfStrings = numberOfStrings;
    }

    public void tune(){
        System.out.println(mannufacturer+" soittimesta viritetään "+numberOfStrings+" kieltä!");
    }
}
