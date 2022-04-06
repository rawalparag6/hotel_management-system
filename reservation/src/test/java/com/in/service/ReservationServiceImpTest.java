package com.in.service;

import com.in.repo.ReservationRepo;
import com.in.reservation.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ReservationServiceImpTest {

    @Mock
    private ReservationRepo reservationRepo;

    private ReservationServiceImp reservationServiceImp;
    @BeforeEach
    void setUp(){
        this.reservationServiceImp=new ReservationServiceImp(this.reservationRepo);
    }


    @Test
    @Order(1)
    void addReservation() {
        Reservation reservation=new Reservation("1","pg","xyz",5,6);
        when(reservationRepo.save(reservation)).thenReturn(reservation);
        assertEquals(reservation,reservationServiceImp.addReservation(reservation));

    }

    @Test
    @Order(2)
    void getReservation() {
        reservationServiceImp.getReservation();
        verify(reservationRepo).findAll();
    }

    @Test
    @Order(3)
    void updateReservation() {
        Reservation reservation=new Reservation("78","pankajg","xhhhhyz",8,0);
        when(reservationRepo.save(reservation)).thenReturn(reservation);
        assertEquals(reservation,reservationServiceImp.updateReservation(reservation));
    }

    @Test
    @Order(4)
    void deleteReservation() {
        String roomId = "03";
        reservationServiceImp.deleteReservation(roomId);
        verify(reservationRepo,times(1)).deleteById(Integer.valueOf(roomId));
    }

}
