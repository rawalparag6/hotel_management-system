package com.in.service;

import com.in.Model.Room;
import com.in.Repo.RoomRepository;
import com.in.Service.RoomServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RoomServiceImplTest {
    @Mock
    private RoomRepository roomRepository;

    private RoomServiceImpl roomServiceImp;

    @BeforeEach
    void setUp(){
        this.roomServiceImp=new RoomServiceImpl(this.roomRepository);
    }
    @Test
    @Order(1)
    void addRoom() {
        Room room=new Room("1","luxury","yes","7000");
        when(roomRepository.save(room)).thenReturn(room);
        assertEquals(room,roomServiceImp.addRoom(room));
    }

    @Test
    @Order(2)
    void getRoom() {
        roomServiceImp.getRoom();
        verify(roomRepository).findAll();
    }
}