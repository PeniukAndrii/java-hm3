package Task1;

public class Pants extends Wear implements WomanWear, ManWear{
    public Pants() {
    }

    public Pants(WearSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void DressMan() {
        System.out.println("Одів штани");

    }

    @Override
    public void DressWoman() {
        System.out.println("Оділа штани");

    }

    @Override
    public String toString() {
        return "Pants{} " + super.toString();
    }
}
