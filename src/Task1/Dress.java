package Task1;

public class Dress extends Wear implements WomanWear{
    public Dress() {
    }

    public Dress(WearSize size, int price, String color) {
        super(size, price, color);
    }


    @Override
    public void DressWoman() {
        System.out.println("Оділа плаття");
    }

    @Override
    public String toString() {
        return "Dress{} " + super.toString();
    }
}
