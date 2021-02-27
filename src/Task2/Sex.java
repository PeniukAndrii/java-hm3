package Task2;

public enum Sex {
    male("male"),
    female("female");


    private String sex;

    Sex(String sex) {
        sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        sex = sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}
