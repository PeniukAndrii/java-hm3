package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Wear[] wears = new Wear[4];
//        wears[0] = new Dress(WearSize.XS,123,"White");
//        wears[1] = new Tie(WearSize.L,231,"Blue");
//        wears[2] = new Pants(WearSize.S,321,"Black");
//        wears[3] = new T_Shirt(WearSize.XXS,325,"Yellow");
//        Atelier atelier = new Atelier(wears);
//        atelier.getManChoice();

        ArrayList<Wear> wears = new ArrayList<>();
        wears.add(new Dress(WearSize.XS,123,"White"));
        wears.add(new Tie(WearSize.L,231,"Blue"));
        wears.add(new Pants(WearSize.S,321,"Black"));
        wears.add(new T_Shirt(WearSize.XXS,325,"Yellow"));
        System.out.println(wears);
        Atelier atelier = new Atelier(wears);
        atelier.getManChoice();
        atelier.getWomanChoice();
    }
}
