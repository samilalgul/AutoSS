package ceng.anadolu.bim492.Showrooms;

import ceng.anadolu.bim492.Vehicles.Vehicle;

public abstract class Showroom {

    public Vehicle buyVehicle(String type){
        Vehicle vehicle;

        vehicle = produceVehicle(type);

        vehicle.assemble();
        vehicle.test();
        vehicle.deliver();

        return vehicle;
    }

    abstract Vehicle produceVehicle(String type);


}
