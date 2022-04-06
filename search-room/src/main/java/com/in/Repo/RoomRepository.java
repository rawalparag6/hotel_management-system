package com.in.Repo;

import com.in.Model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RoomRepository extends MongoRepository<Room, Integer> {
}
