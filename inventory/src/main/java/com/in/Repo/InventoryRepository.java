package com.in.Repo;

import com.in.entity.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory , Integer> {

}
