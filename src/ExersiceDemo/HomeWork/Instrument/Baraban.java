package ExersiceDemo.HomeWork.Instrument;



public class Baraban implements Instrument {
    private String diametr;

    @Override
    public void play() {
        System.out.println("Plaing Baraban with diametr " + this.diametr);
    }

    public Baraban(String diametr){
        this.diametr = diametr;
    }

    public String getDiametr(){
        return diametr;
    }

    public void setDiametr(String diametr){
        this.diametr = diametr;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if( o == null || getClass() != o.getClass()) return false;
        Baraban baraban = (Baraban) o;
        return diametr == baraban.diametr;
    }
}

