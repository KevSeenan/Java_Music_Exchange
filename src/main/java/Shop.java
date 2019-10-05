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

}

