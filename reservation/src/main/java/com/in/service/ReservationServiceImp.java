package com.in.service;

import com.in.repo.ReservationRepo;
import com.in.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ReservationServiceImp implements ReservationService {
   @Autowired
   private ReservationRepo reservationRepo;

    @Override
    public List<Reservation> getReservation() {
        return this.reservationRepo.findAll();
    }

    @Override
    public Object getReservation(String roomId) {
        return this.reservationRepo.findById(Integer.valueOf(roomId));
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return this.reservationRepo.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return this.reservationRepo.save(reservation);
    }

    @Override
    public String deleteReservation(String roomId) {
        this.reservationRepo.deleteById(Integer.valueOf(roomId));
        return roomId + "is deleted";
    }

    public ReservationServiceImp(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }
}