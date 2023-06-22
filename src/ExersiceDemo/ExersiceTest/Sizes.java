package ExersiceDemo.ExersiceTest;

public enum Sizes {
    S("38"),
    M("40"),
    L("42"),
    XL("44");

    private String size;

    Sizes(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
