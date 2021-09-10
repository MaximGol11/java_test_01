package Course_Nemchinsky;

import java.util.Objects;

//class
public abstract class Car implements Services {
    String carName;
    int yearOfProduction;
    int price;
    int wight;
    Colors color;
    private int distance = 0;
    protected int distanceOnService = 0;

        // constructor
    public Car(String carName, int yearOfProduction, int price, int wight, Colors color) {
        this.carName = carName;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.wight = wight;
        this.color = color;
    }
    public void addDistance (int addInitialDistance) {
        if (addInitialDistance > 0) {
            distance += addInitialDistance;
            distanceOnService += addInitialDistance;
        } else {
            System.out.println("Distance cannot be less than zero");
        }
    }
    public void addDistance (double addInitialDistance) {
        if (addInitialDistance > 0) {
            distance += addInitialDistance;
            distanceOnService += addInitialDistance;
        } else {
            System.out.println("Distance cannot be less than zero");
        }
    }

    public int getDistance() {
        return distance;
    }
    public  int getDistanceOnService() {
        return  distanceOnService;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", wight=" + wight +
                ", color=" + color +
                ", distance=" + distance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && price == car.price && wight == car.wight && Objects.equals(carName, car.carName) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, yearOfProduction, price, wight, color);
    }
}

