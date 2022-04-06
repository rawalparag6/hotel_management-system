package com.in.Controller;

import com.in.Model.Room;
import com.in.Service.RoomService;
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
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    final Logger logger= LoggerFactory.getLogger(RoomController.class);

    @PostMapping("/add")
    public ResponseEntity<?> addRoom(@RequestBody Room room) {
        logger.info("Inside add room details of roomcontroller");
        return ResponseEntity.ok(roomService.addRoom(room));
    }
    @GetMapping("/find")
    public ResponseEntity<?> getRoom() {
        logger.info("Inside find room details of roomcontroller");
        return ResponseEntity.ok(roomService.getRoom());
    }
}
