package HomeWork.EnumSize;

public enum Size {
    XXS(32){public String getDescription(){return "Детский размер";}},
    XS(34), S(36), M(38), L(40);

    public final int euroSize;

    Size(int euroSize){
        this.euroSize= euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }

}
