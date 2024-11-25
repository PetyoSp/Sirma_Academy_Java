package com.sirma.abstractclasses;

import com.sirma.interfaces.*;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {
    private String itemName;
    private String itemCategory;
    private boolean breakable;
    private boolean perishable;
    private double price;

       public AbstractItem(String name, String category, boolean breakable, boolean perishable, double price) {
        this.itemName = name;
        this.itemCategory = category;
        this.breakable = breakable;
        this.perishable = perishable;
        this.price = price;
    }


    @Override
    public String getItemDetails() {
        return "Name: " + itemName + ", Category: " + itemCategory;
    }

    @Override
    public void displayDescription() {
        System.out.println(getItemDetails() + ", Price: " + price);
    }


    @Override
    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    @Override
    public String getItemCategory() {
        return this.itemCategory;
    }


    @Override
    public boolean isBreakable() {
        return this.breakable;
    }

    @Override
    public void handleBreakage() {
        System.out.println("Item " + itemName + " has been marked as broken.");
    }

    @Override
    public double calculateValue() {
        return 0;
    }

    @Override
    public boolean isPerishable() {
        return this.perishable;
    }

    @Override
    public void handleExpiration() {
        System.out.println("Item " + itemName + " has expired.");
    }

    // Implementing Sellable methods
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

