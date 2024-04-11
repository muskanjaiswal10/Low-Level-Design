package ExampleWithStrategyDesignPattern;

import ExampleWithStrategyDesignPattern.Strategy.SportsDriveStrategy;
import ExampleWithStrategyDesignPattern.Vehicle;
public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}