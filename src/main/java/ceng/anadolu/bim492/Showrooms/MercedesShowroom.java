package ceng.anadolu.bim492.Showrooms;


import ceng.anadolu.bim492.Vehicles.Cabrio.MercedesCabrio;
import ceng.anadolu.bim492.Vehicles.Crossover.MercedesCrossover;
import ceng.anadolu.bim492.Vehicles.SUV.MercedesSUV;
import ceng.anadolu.bim492.Vehicles.Sedan.MercedesSedan;
import ceng.anadolu.bim492.Vehicles.Vehicle;

public class MercedesShowroom extends Showroom {
    @Override
    Vehicle produceVehicle(String type) {
        if(type.equals("cabrio")) {
            return new MercedesCabrio();
        } else if(type.equals("crossover")) {
            return new MercedesCrossover();
        } else if(type.equals("sedan")){
            return new MercedesSedan();
        } else if (type.equals("SUV")){
            return new MercedesSUV();
        }
        else return null;
    }
}
