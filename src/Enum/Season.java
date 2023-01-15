package Enum;

public enum Season {
    SUMMER("лето"), WINTER("зима"), AUTUMN("осень"), SPRING("весна");

    private String translation;

    Season(String translation){
        this.translation = translation;

    }
    public String getTranslation(){
        return translation;
    }
}
