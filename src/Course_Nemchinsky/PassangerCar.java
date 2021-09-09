package Course_Nemchinsky;

public class PassangerCar extends Car {

    public PassangerCar(String carName, int yearOfProduction, int price, int wight, Colors color) {
        super(carName, yearOfProduction, price, wight, color);
    }

    @Override
    public boolean readyOnService() {
        return distanceOnService > 10000;
    }
}
