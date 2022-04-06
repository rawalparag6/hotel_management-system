package com.in.repo;

import com.in.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department , Integer> {
}
