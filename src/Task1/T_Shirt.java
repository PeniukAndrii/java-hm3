package Task1;

public class T_Shirt extends Wear implements WomanWear, ManWear{

    public T_Shirt() {
    }

    public T_Shirt(WearSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void DressMan() {
        System.out.println("Одів футболочку");
    }

    @Override
    public void DressWoman() {
        System.out.println("Оділа футболочку");
    }

    @Override
    public String toString() {
        return "T_Shirt{} " + super.toString();
    }
}
