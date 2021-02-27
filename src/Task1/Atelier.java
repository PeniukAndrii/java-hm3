package Task1;

import java.util.ArrayList;

public class Atelier {
    private ArrayList<Wear> wears;

    public Atelier() {
    }

    public Atelier(ArrayList<Wear> wears) {
        this.wears = wears;
    }

    public ArrayList<Wear> getWears() {
        return wears;
    }

    public void setWears(ArrayList<Wear> wears) {
        this.wears = wears;
    }

    public void getManChoice(){
        for(Wear wear : wears){
            if (wear instanceof ManWear) {
                System.out.println(wear + " Man Choice");
            }
        }
    }


    public void getWomanChoice(){
        for(Wear wear : wears){
            if(wear instanceof WomanWear){
                System.out.println(wear + " Woman Choice");
            }
        }
    }
    @Override
    public String toString() {
        return "Atelier{" +
                "wears=" + wears +
                '}';
    }
}
