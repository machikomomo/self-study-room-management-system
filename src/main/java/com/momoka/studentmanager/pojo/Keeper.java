package com.momoka.studentmanager.pojo;

public class Keeper {
    private int id;
    private String roomArea;
    private String address;
    private String roomKeeper;
    private String keeperGender;
    private String keeperAge;

    public Keeper(){
    }

    public Keeper(int id, String roomArea, String address, String roomKeeper, String keeperGender, String keeperAge) {
        this.id = id;
        this.roomArea = roomArea;
        this.address = address;
        this.roomKeeper = roomKeeper;
        this.keeperGender = keeperGender;
        this.keeperAge = keeperAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(String roomArea) {
        this.roomArea = roomArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoomKeeper() {
        return roomKeeper;
    }

    public void setRoomKeeper(String roomKeeper) {
        this.roomKeeper = roomKeeper;
    }

    public String getKeeperGender() {
        return keeperGender;
    }

    public void setKeeperGender(String keeperGender) {
        this.keeperGender = keeperGender;
    }

    public String getKeeperAge() {
        return keeperAge;
    }

    public void setKeeperAge(String keeperAge) {
        this.keeperAge = keeperAge;
    }
}
