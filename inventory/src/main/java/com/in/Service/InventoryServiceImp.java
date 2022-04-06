package com.in.Service;

import com.in.Repo.InventoryRepository;
import com.in.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImp implements InventoryService{
    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public Inventory addInventory(Inventory inventory) {
        return this.inventoryRepository.save(inventory);
    }

    @Override
    public Object getInventory(String pId) {
        return this.inventoryRepository.findById(Integer.valueOf(pId));
    }
    @Override
    public List<Inventory> getInventory() {
        return this.inventoryRepository.findAll();
    }

    @Override
    public Inventory updateInventory(Inventory inventory) {
        return this.inventoryRepository.save(inventory);
    }

   @Override
   public String deleteInventory(String pId) {
       this.inventoryRepository.deleteById(Integer.valueOf(pId));
       return pId + "is deleted";
   }

    public InventoryServiceImp(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }
}
