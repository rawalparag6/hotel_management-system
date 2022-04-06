package com.in.Service;

import com.in.entity.Inventory;

import java.util.List;

public interface InventoryService {
    Inventory addInventory(Inventory inventory);

    Object getInventory(String pId);

    List<Inventory> getInventory();

    Inventory updateInventory(Inventory inventory);

    String deleteInventory(String pId);
}
