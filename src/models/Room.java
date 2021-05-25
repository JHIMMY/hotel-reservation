package models;

public class Room implements IRoom{
    // instance variables
    private String roomNumber;
    private Double price;
    private RoomType roomType;

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomtype() {
        return roomType;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public String toString(){
        return "Room{ Room number: " + roomNumber + ", Price: " + price + ", Room type: " +
                roomType;
    }

    // original setter
    public void setPrice(Double price){
        this.price = price;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
} // eof class
