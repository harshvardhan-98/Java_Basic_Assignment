package Question18.P3;
import Printer.*;
public interface Vehicle {
    static void display(String name) {
        Printer.print("Vehicle details:");
    }
    default void run(){
        Printer.print("Vehicle is running");
    }
}
interface VehicleTest{
    public default void run(){
        Printer.print("From Vehicle Test Interface");
    }
}

class Bike implements Vehicle, VehicleTest{
    String name;
    Bike(String name){
        this.name = name;
    }
    @Override
    public void run() {
        Printer.print("Bike is running.... from Vehicle interface");
        Printer.print("Bike is running.... from VehicleTest interface");
    }

    public static void display(String name){
        Printer.print("Bike name : "+name);
    }
}
