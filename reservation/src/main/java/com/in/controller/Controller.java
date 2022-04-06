package com.in.controller;

import com.in.reservation.Reservation;
import com.in.service.ReservationService;
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
@RequestMapping("/reservation")
public class Controller{
    @Autowired
    private ReservationService reservationService;

    final Logger logger= LoggerFactory.getLogger(Controller.class);

    @GetMapping("/guestdetails")
    public ResponseEntity<?> getReservation() {
        logger.info("Inside find reservation details of reservationcontroller");
        return ResponseEntity.ok(reservationService.getReservation());
    }

    @GetMapping("/guestdetails/{roomId}")
    public ResponseEntity<?> getReservationbyId(@PathVariable String roomId) {
        logger.info("Inside find reservation details of reservationcontroller");
        return ResponseEntity.ok(reservationService.getReservation(roomId));
    }
   @PostMapping("/add")
    public ResponseEntity<?> addReservation(@RequestBody Reservation reservation)
    {
        logger.info("Inside add reservaton details of reservationcontroller");
        return ResponseEntity.ok(reservationService.addReservation(reservation));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateReservation(@RequestBody Reservation reservation)
    {
        logger.info("Inside update staff details of reservationcontroller");
        return ResponseEntity.ok(reservationService.updateReservation(reservation));
    }
    @DeleteMapping("/delete/{roomId}")
    public ResponseEntity<?> deleteReservation(@PathVariable String roomId) {
        logger.info("Inside delete reservation details of reservationcontroller");
        return ResponseEntity.ok(reservationService.deleteReservation(roomId));
    }


}
