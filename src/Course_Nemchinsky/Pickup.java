package Course_Nemchinsky;

public class Pickup extends Car {
    public Pickup(String carName, int yearOfProduction, int price, int wight, Colors color) {
        super(carName, yearOfProduction, price, wight, color);
    }

    @Override
    public boolean readyOnService() {
        return distanceOnService > 30000;
    }
}
