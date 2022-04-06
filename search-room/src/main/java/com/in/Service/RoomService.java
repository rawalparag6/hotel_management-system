package com.in.Service;

import com.in.Model.Room;

import java.util.List;

public interface RoomService {
    Room addRoom(Room room);

    List<Room> getRoom();
}
