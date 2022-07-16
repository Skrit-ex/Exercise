package HomeWork.Instrument;

import java.util.Objects;

public class Truba implements  Instrument{
    private int lonG;

    public void play(){
        System.out.println("Plaing guitar which have long  " + this.lonG);
    }
    public Truba(int lonG){
        this.lonG = lonG;
    }
    public int getLonG(){
        return lonG;
    }
    public void setLonG(int lonG){
        this.lonG = lonG;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truba truba = (Truba) o;
        return lonG == truba.lonG;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lonG);
    }

}
