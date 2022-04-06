package com.in.repo;


import com.in.reservation.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepo extends MongoRepository<Reservation ,Integer> {
}
