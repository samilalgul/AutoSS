package ceng.anadolu.bim492.Showrooms;

import ceng.anadolu.bim492.Vehicles.Cabrio.BMWCabrio;
import ceng.anadolu.bim492.Vehicles.Crossover.BMWCrossover;
import ceng.anadolu.bim492.Vehicles.SUV.BMWSUV;
import ceng.anadolu.bim492.Vehicles.Sedan.BMWSedan;
import ceng.anadolu.bim492.Vehicles.Vehicle;

public class BMWShowroom extends Showroom{
    @Override
    public Vehicle produceVehicle(String type) {
        if(type.equals("cabrio")) {
            return new BMWCabrio();
        } else if(type.equals("crossover")) {
            return new BMWCrossover();
        } else if(type.equals("sedan")){
            return new BMWSedan();
        } else if (type.equals("SUV")){
            return new BMWSUV();
        }
        else return null;
    }
}
