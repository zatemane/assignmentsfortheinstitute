package fifteen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Runner {
    public static void main(String[] args) {
        Map<String, Bouquet> flowerShopMap = new HashMap<>();
        flowerShopMap.put("Land", new Bouquet("Rose Bouquet", 12, 1.5));
        flowerShopMap.put("Shop", new Bouquet("Mixed Bouquet", 10, 2.0));

        System.out.println("Размер мапы: " + flowerShopMap.size());

        System.out.println("Пара по ключу 'Land': " + flowerShopMap.get("Land").name + ", "
                + flowerShopMap.get("Land").numOfRoses + " роз, цена за розу: " + flowerShopMap.get("Land").pricePerRose);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите магазин для определения количества ключей: ");
        String selectedShop = scanner.nextLine();

        if (flowerShopMap.containsKey(selectedShop)) {
            System.out.println("Количество ключей у магазина " + selectedShop + ": " + flowerShopMap.size());

            System.out.print("Введите новое количество роз для магазина " + selectedShop + ": ");
            int newNumOfRoses = scanner.nextInt();
            flowerShopMap.get(selectedShop).numOfRoses = newNumOfRoses;

            System.out.println("\nМапа:");
            int index = 1;
            for (Map.Entry<String, Bouquet> entry : flowerShopMap.entrySet()) {
                System.out.println(index + ". " + entry.getKey() + ": " + entry.getValue().name + ", "
                        + entry.getValue().numOfRoses + " роз, цена за розу: " + entry.getValue().pricePerRose);
                index++;
            }

            // Определить стоимость всех цветов в интересующем магазине
            double totalCost = flowerShopMap.get(selectedShop).numOfRoses * flowerShopMap.get(selectedShop).pricePerRose;
            System.out.println("Общая стоимость цветов в магазине " + selectedShop + ": " + totalCost);
        } else {
            System.out.println("Магазин не найден.");
        }
    }
}
