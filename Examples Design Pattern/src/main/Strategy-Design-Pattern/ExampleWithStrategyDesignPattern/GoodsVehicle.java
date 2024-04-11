package ExampleWithStrategyDesignPattern;

import ExampleWithStrategyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super (new NormalDriveStrategy());
    }
}