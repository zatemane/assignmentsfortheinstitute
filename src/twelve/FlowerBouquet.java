package twelve;

class FlowerBouquet {
    private String name;
    private int roses;
    private int lilies;
    private int ruscus;
    private double price;

    public FlowerBouquet(String name, int roses, int lilies, int ruscus, double price) {
        this.name = name;
        this.roses = roses;
        this.lilies = lilies;
        this.ruscus = ruscus;
        this.price = price;
    }

    public boolean checkTotalQuantity() {
        int totalQuantity = roses + lilies + ruscus;
        return totalQuantity % 2 != 0 && totalQuantity <= (roses + lilies + ruscus);
    }

    public double calculateProfit(double expenses) {
        return price - expenses;
    }
}
