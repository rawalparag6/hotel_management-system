package com.in.service;

import com.in.reservation.Reservation;


import java.util.List;

public interface ReservationService {
   List<Reservation> getReservation();
   Object getReservation(String roomId);
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    String deleteReservation(String roomId);

   // ResponseEntity<?> findById(String roomId);
}
