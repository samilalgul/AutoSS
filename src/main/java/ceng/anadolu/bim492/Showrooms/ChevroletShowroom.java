package ceng.anadolu.bim492.Showrooms;

import ceng.anadolu.bim492.Vehicles.Cabrio.BMWCabrio;
import ceng.anadolu.bim492.Vehicles.Cabrio.ChevroletCabrio;
import ceng.anadolu.bim492.Vehicles.Crossover.BMWCrossover;
import ceng.anadolu.bim492.Vehicles.Crossover.ChevroletCrossover;
import ceng.anadolu.bim492.Vehicles.SUV.BMWSUV;
import ceng.anadolu.bim492.Vehicles.SUV.ChevroletSUV;
import ceng.anadolu.bim492.Vehicles.Sedan.BMWSedan;
import ceng.anadolu.bim492.Vehicles.Sedan.ChevroletSedan;
import ceng.anadolu.bim492.Vehicles.Vehicle;

public class ChevroletShowroom extends Showroom {
    @Override
    public Vehicle produceVehicle(String type) {
        if(type.equals("cabrio")) {
            return new ChevroletCabrio();
        } else if(type.equals("crossover")) {
            return new ChevroletCrossover();
        } else if(type.equals("sedan")){
            return new ChevroletSedan();
        } else if (type.equals("SUV")){
            return new ChevroletSUV();
        }
        else return null;
    }
}
