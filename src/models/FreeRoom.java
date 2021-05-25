package models;

public class FreeRoom extends Room {

    // new constructor
    public FreeRoom(){
        super();
        setPrice(0.0);
    }

    @Override
    public String toString(){
        return super.toString() + "Free room";
    }

}
