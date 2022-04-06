package com.in.reservation;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "r1")
public class Reservation {
    //@Id
    private String RoomId;
    private String Name;
    private String address;
    private int days;
    private int persons;

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String roomId) {
        RoomId = roomId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Reservation(String roomId, String name, String address, int days, int persons) {
        this.RoomId=roomId;
        Name = name;
        this.address = address;
        this.days = days;
        this.persons = persons;
    }

    public Reservation() {
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "RoomId='" + RoomId +'\'' +
                "Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                ", days=" + days +
                ", persons=" + persons +
                '}';
    }
}