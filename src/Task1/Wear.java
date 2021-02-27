package Task1;

public abstract class Wear {
    private WearSize size;
    private int price;
    private String color;

    public Wear() {
    }

    public Wear(WearSize size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public WearSize getSize() {
        return size;
    }

    public void setSize(WearSize size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Wear{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
