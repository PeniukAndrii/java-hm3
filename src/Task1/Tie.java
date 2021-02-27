package Task1;

public class Tie extends Wear implements ManWear{
    public Tie() {
    }

    public Tie(WearSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void DressMan() {
        System.out.println("Одів Галстук");
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
