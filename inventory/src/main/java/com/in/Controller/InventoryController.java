package com.in.Controller;

import com.in.Service.InventoryService;
import com.in.entity.Inventory;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    final Logger logger= LoggerFactory.getLogger(InventoryController.class);


    @PostMapping("/add")
    public ResponseEntity<?> addInventory(@RequestBody Inventory inventory){
        logger.info("Inside add inventory details of inventorycontroller");
        return ResponseEntity.ok(inventoryService.addInventory(inventory));
    }
    @GetMapping("/find")
    public ResponseEntity<?> getInventory(){
        logger.info("Inside find inventory details of inventorycontroller");
        return  ResponseEntity.ok(inventoryService.getInventory());
    }
    @GetMapping("/find/{Id}")
    public  ResponseEntity<?> getInventoryById(@PathVariable String pId){
        logger.info("Inside find inventory details of inventorycontroller");
        return ResponseEntity.ok(inventoryService.getInventory(pId));
    }
    @PutMapping("/update")
    public ResponseEntity<?> updateInventory(@RequestBody Inventory inventory){
        logger.info("Inside update inventory details of inventorycontroller");
        return ResponseEntity.ok(inventoryService.updateInventory(inventory));
    }
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<?> deleteInventoryById(@PathVariable String pId){
        logger.info("Inside delete inventory details of inventorycontroller");
        return ResponseEntity.ok(inventoryService.deleteInventory(pId));
    }
}




