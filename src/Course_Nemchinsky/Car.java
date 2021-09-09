package Course_Nemchinsky;

import java.util.Objects;

//class
public class Car {
    String carName;
    int yearOfProduction;
    int price;
    int wight;
    Colors color;

        // constructor
    public Car(String carName, int yearOfProduction, int price, int wight, Colors color) {
        this.carName = carName;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.wight = wight;
        this.color = color;
    }

        @Override
        public String toString() {
            return "Car{" +
                    "carName='" + carName + '\'' +
                    ", yearOfProduction=" + yearOfProduction +
                    ", price=" + price +
                    ", wight=" + wight +
                    ", color='" + color + '\'' +
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

