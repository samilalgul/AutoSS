package ceng.anadolu.bim492.Showrooms;


import ceng.anadolu.bim492.Vehicles.Cabrio.FordCabrio;
import ceng.anadolu.bim492.Vehicles.Crossover.FordCrossover;
import ceng.anadolu.bim492.Vehicles.SUV.FordSUV;
import ceng.anadolu.bim492.Vehicles.Sedan.FordSedan;
import ceng.anadolu.bim492.Vehicles.Vehicle;

public class FordShowroom extends Showroom {
    @Override
    Vehicle produceVehicle(String type) {
        if(type.equals("cabrio")) {
            return new FordCabrio();
        } else if(type.equals("crossover")) {
            return new FordCrossover();
        } else if(type.equals("sedan")){
            return new FordSedan();
        } else if (type.equals("SUV")){
            return new FordSUV();
        }
        else return null;
    }
}
