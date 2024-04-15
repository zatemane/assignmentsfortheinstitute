package thirteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Bouquet {
    private String name;
    private int roses;
    private int lilies;
    private int ruscuses;
    private double price;
    private Packaging packaging;

    public Bouquet(String name, int roses, int lilies, int ruscuses, double price, Packaging packaging) {
        this.name = name;
        this.roses = roses;
        this.lilies = lilies;
        this.ruscuses = ruscuses;
        this.price = price;
        this.packaging = packaging;
    }

    public static void sortBouquetsByPrice(ArrayList<Bouquet> bouquets) {
        Collections.sort(bouquets, Comparator.comparingDouble(Bouquet::getPrice));
//        for (Bouquet bouquet : bouquets) {
//            System.out.println(bouquet);
//        }
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public String toString() {
        return "Bouquet{" +
                "name='" + name + '\'' +
                ", roses=" + roses +
                ", lilies=" + lilies +
                ", ruscuses=" + ruscuses +
                ", price=" + price +
                ", packaging=" + packaging +
                '}';
    }
}

class Packaging {
    private String material;
    private double price;
    private boolean shiny;
    private boolean packaged;

    public Packaging(String material, double price, boolean shiny, boolean packaged) {
        this.material = material;
        this.price = price;
        this.shiny = shiny;
        this.packaged = packaged;
    }

    public boolean isPackaged() {
        return packaged;
    }

    public String toString() {
        return "Packaging{" +
                "material='" + material + '\'' +
                ", price=" + price +
                ", shiny=" + shiny +
                ", packaged=" + packaged +
                '}';
    }
}
