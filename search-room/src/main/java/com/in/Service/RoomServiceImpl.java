package com.in.Service;

import com.in.Model.Room;
import com.in.Repo.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room addRoom(Room room) {
        return this.roomRepository.save(room);
    }

    @Override
    public List<Room> getRoom() {
        return this.roomRepository.findAll();
    }

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
}
