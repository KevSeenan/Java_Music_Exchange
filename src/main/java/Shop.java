import behaviours.ISell;


import java.util.ArrayList;

public class Shop {

    private String name;
    private int capacity;
    private ArrayList<ISell> stock;

    public Shop(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public int stockCount() {
        return this.stock.size();
    }


    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public double calculateTotalPotentialProfit() {
        double totalPotentialProfit = 0;

        for (ISell item: this.stock) {
            totalPotentialProfit += item.calculateMarkup();
        }

        return totalPotentialProfit;
    }
}

