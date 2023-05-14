package domain;

public abstract class Residence {

    private int price;
    private int squareMeter;

    private int numberOfRooms;

    private int numberOfHalls;

    public Residence(int price, int squareMeter, int numberOfRooms, int numberOfHalls) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
    }

    public int getPrice() {
        return price;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "price=" + price +
                ", squareMeter=" + squareMeter +
                ", roomNumber=" + numberOfRooms +
                ", saloonNumber=" + numberOfHalls +
                '}';
    }
}
