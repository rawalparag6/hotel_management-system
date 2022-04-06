package com.in.Service;

import com.in.Repo.InventoryRepository;
import com.in.entity.Inventory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InventoryServiceImpTest {
    @Mock
    private InventoryRepository inventoryRepository;

    private InventoryServiceImp inventoryServiceImp;

    @BeforeEach
    void setUp(){
        this.inventoryServiceImp=new InventoryServiceImp(this.inventoryRepository);
    }

    @Test
    @Order(1)
    void addInventory() {
        Inventory inventory=new Inventory("1","pg","80","800");
        when(inventoryRepository.save(inventory)).thenReturn(inventory);
        assertEquals(inventory,inventoryServiceImp.addInventory(inventory));

    }

    @Test
    @Order(2)
    void getInventory() {
        inventoryServiceImp.getInventory();
        verify(inventoryRepository).findAll();
    }

    @Test
    @Order(3)
    void updateInventory() {
        Inventory inventory=new Inventory("8","prg","80","800");
        when(inventoryRepository.save(inventory)).thenReturn(inventory);
        assertEquals(inventory,inventoryServiceImp.updateInventory(inventory));
    }

    @Test
    @Order(4)
    void deleteInventory() {
        String pId = "8";
        inventoryServiceImp.deleteInventory(pId);
        verify(inventoryRepository,times(1)).deleteById(Integer.valueOf(pId));
    }
}