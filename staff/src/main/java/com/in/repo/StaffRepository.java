package com.in.repo;

import com.in.entity.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StaffRepository extends MongoRepository<Staff, String> {
}
