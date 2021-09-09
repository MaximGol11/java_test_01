package Course_Nemchinsky;

public class CarManager {
     public static void main(String[] args) {

     PassangerCar toyota = new PassangerCar("Toyota Camry", 2007, 15000, 1500, Colors.RED );
     Pickup ford = new Pickup("Ford F150", 2010, 20000, 2200, Colors.WHITE);

     toyota.addDistance(1000);
     toyota.addDistance(1000.5);
     toyota.addDistance(10000);
     ford.addDistance(15000);
          System.out.println(toyota);
          System.out.println(ford);

          System.out.println(toyota.readyOnService());
          System.out.println(ford.readyOnService());







     }


}

