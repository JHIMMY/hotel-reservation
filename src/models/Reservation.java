package models;

import java.util.Date;

public class Reservation {
    // instance variables
    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    // methods
    @Override
    public String toString(){
        return "Reservation{" +
                "Customer: " + customer +
                ", Room: " + room +
                ", Check In Date: " + checkInDate +
                ", Check Out Date: " + checkOutDate;
    }

}
