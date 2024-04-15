package twelve;
//import twelve.flowerBouquet.FlowerBouquet;
//Букет
//        цветов
//Название,
//        Число роз, Число
//лилий,
//        Число рускусов,
//                Цена
public class Runner {
    public static void main(String[] args) {
        FlowerBouquet bouquet = new FlowerBouquet("Rose and Lily Bouquet", 10, 5, 3, 50.0);

        if (bouquet.checkTotalQuantity()) {
            System.out.println("Общее количество нечетное и не превышает суммы роз, лилий и рускусов.");
        } else {
            System.out.println("Общее количество равно или превышает сумму роз, лилий и рускусов.");
        }

        double expenses = 30.0;
        double profit = bouquet.calculateProfit(expenses);
        System.out.println("Доход: $" + profit);
    }
}