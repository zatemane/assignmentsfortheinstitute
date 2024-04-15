package thirteen;
import thirteen.Bouquet;
import thirteen.Packaging;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Packaging paper = new Packaging("Paper", 5.0, false, true);
        Packaging plastic = new Packaging("Plastic", 3.0, true, true);

        Bouquet b1 = new Bouquet("Rose Lily Bouquet", 6, 3, 2, 30.0, paper);
        Bouquet b2 = new Bouquet("Lily Ruscus Bouquet", 4, 5, 6, 25.0, plastic);

        ArrayList<Bouquet> bouquets = new ArrayList<>();
        bouquets.add(b1);
        bouquets.add(b2);

        Bouquet.sortBouquetsByPrice(bouquets);

        for (Bouquet bouquet : bouquets) {
            System.out.println(bouquet);
        }

        int numWithPackaging = b1.getPackaging().isPackaged() ? 1 : 0;
        int numWithoutPackaging = b2.getPackaging().isPackaged() ? 0 : 1;

        System.out.printf("Количество букетов розовых лилий с упаковкой: %d\nКоличество Букетов Рускус-Лилии без упаковки: %d",
                numWithPackaging, numWithoutPackaging);

    }
}
