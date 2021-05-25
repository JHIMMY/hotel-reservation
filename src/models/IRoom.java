package models;

public interface IRoom {
    // interfaces are behaviours that you can give to any class. It is best to use when you have classes
    // that are not related between them and you want to give them some common task, also you can have them be in a One type
    // to use polymorphism

    // you can have static methods and maybe constants but no implementation for the rest of regular methods
    // they are abstract implicitly
    String getRoomNumber();
    Double getRoomPrice();
    RoomType getRoomtype();
    boolean isFree();
}
