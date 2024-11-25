package com.sirma.superclasses;

import com.sirma.abstractclasses.AbstractItem;

public class InventoryItem extends AbstractItem {

    public InventoryItem(String name, String category, boolean breakable, boolean perishable, double price) {
        super(name, category, breakable, perishable, price);
    }
}
