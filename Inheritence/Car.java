package Inheritence;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car obj = new Car();

        obj.wheelsCount = 6;
        obj.model = "matador-407";

        obj.start();
        obj.start(obj.model);
    }
}
