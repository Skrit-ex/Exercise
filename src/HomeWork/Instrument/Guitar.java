package HomeWork.Instrument;

public class Guitar implements Instrument {
    private int struna;

    public void play(){
        System.out.println("Playing Guitar with amount strun " + this.struna);
    }

    public Guitar(int struna) {
        this.struna = struna;
    }

    public int getStruna() {
        return struna;
    }

    public void setStruna(int struna) {
        this.struna = struna;
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if( o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return struna == guitar.struna;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "struna=" + struna +
                '}';
    }
}
