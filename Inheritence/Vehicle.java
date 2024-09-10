package Inheritence;

public class Vehicle {

        int wheelsCount;
        String model;

        void start() {
            System.out.println("vehicle is starting");
        }
        void start(String model){
            System.out.println(model + " is starting whose wheel count is "+wheelsCount);
        }
}
