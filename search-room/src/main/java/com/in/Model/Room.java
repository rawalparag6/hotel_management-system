package com.in.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roomdata")
public class Room {
    private String RoomId;
    private String RoomType;
    private String Availability;
    private String Price;

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String roomId) {
        RoomId = roomId;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Room(String roomId, String roomType, String availability, String price) {
        RoomId = roomId;
        RoomType = roomType;
        Availability = availability;
        Price = price;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomId='" + RoomId + '\'' +
                ", RoomType='" + RoomType + '\'' +
                ", Availability='" + Availability + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}
