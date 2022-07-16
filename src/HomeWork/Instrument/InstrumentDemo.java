package HomeWork.Instrument;

public class InstrumentDemo {

    public static void main(String[] args) {
        Instrument instrument1 = new Baraban("15");
        Instrument instrument2 = new Guitar(6);
        Instrument instrument3 = new Truba(14);



        Instrument [] instruments = {instrument1, instrument2, instrument3};
        for ( Instrument i : instruments) {
            i.play();
        }
        // instrument1.play();
        //   instrument2.play();
        //  instrument3.play();



    }
}
