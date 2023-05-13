package domain;

public abstract class Residence {

    private double price;
    private int squareMeter;

    private int roomNumber;

    private int saloonNumber;

    public Residence(double price, int squareMeter, int roomNumber, int saloonNumber) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.roomNumber = roomNumber;
        this.saloonNumber = saloonNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getSaloonNumber() {
        return saloonNumber;
    }
}
