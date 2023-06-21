package ExersiceDemo.Enum.TestProject;

public enum Car {
    AUDI(240,"sport", 12.5), BMW(260,"sport", 13),
    VW(200,"folk", 7), SEAT(195, "folk", 8),
    RENO(200,"urban", 8), JELLY(230,"urban", 9);

    private int speed;
    private String type;
    private double consumption;

    Car(int speed, String type, double consumption) {
        this.speed = speed;
        this.type = type;
        this.consumption = consumption;
    }
    public int getSpeed() {
        return speed;
    }

    public String getType() {
        return type;
    }

    public double getConsumption() {
        return consumption;
    }
}
