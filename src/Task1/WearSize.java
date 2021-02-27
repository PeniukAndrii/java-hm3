package Task1;

public enum WearSize {
    XXS(15),
    XS(20),
    S(25),
    M(30),
    L(35);


    int euroSize;

    WearSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public void getDescription() {
        System.out.println(euroSize);
    }

    @Override
    public String toString() {
        return "Task1.WearSize{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }
}
