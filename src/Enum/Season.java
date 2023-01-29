package Enum;

public enum Season {
    SUMMER("лето", 30), WINTER("зима", -15), AUTUMN("осень", 19),
    SPRING("весна", 18);

    private String translation;
    private  int temperat;

    Season(String translation, int temperat){
        this.translation = translation;
        this.temperat = temperat;
    }


    public String getTranslation(){
        return translation;
    }

    public int getTemperat(){
        return temperat;
    }
}
