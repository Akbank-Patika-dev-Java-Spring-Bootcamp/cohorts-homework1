package domain;

public abstract class Residence {

    private int price;
    private int squareMeter;

    private int roomNumber;

    private int saloonNumber;

    public Residence(int price, int squareMeter, int roomNumber, int saloonNumber) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.roomNumber = roomNumber;
        this.saloonNumber = saloonNumber;
    }

    public int getPrice() {
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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "price=" + price +
                ", squareMeter=" + squareMeter +
                ", roomNumber=" + roomNumber +
                ", saloonNumber=" + saloonNumber +
                '}';
    }
}
