package Exersice.Enum;

public enum Season {
    WINTER(1){public String getDescription(){
        return "Холодное время";}},
    SUMMER(24), AUTUMN(12), SPRING(15);

    private int avrgTmp;

    Season(int avrgTmp) {
        this.avrgTmp = avrgTmp;
    }

    public int getAvrgTmp() {
        return avrgTmp;
    }

    public String getDescription(){
        return "Телпое время";
    }
}
