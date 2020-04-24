package ceng.anadolu.bim492;

import ceng.anadolu.bim492.Showrooms.*;
import ceng.anadolu.bim492.Vehicles.Vehicle;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //System.out.println("Test project");




        //Lets create showrooms
        Showroom bmwShowroom = new BMWShowroom();
        Showroom chevShowroom = new ChevroletShowroom();
        Showroom fordShowroom = new FordShowroom();
        Showroom benzShowroom = new MercedesShowroom();

        //Use stores to buy some car
        //Vehicle types are: sedan, crossover, SUV, cabrio
        Vehicle vehicle = bmwShowroom.buyVehicle("sedan");
        System.out.println("Brad purchased: "+ vehicle.getName());
        vehicle = benzShowroom.buyVehicle("SUV");
        System.out.println("Jennifer purchased: " + vehicle.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 'see' for the last sold vehicle specs or press enter to exit");
        String readString = scanner.nextLine();

        //Could be any brand vehicle bought, you can try with above stores.

        if (readString.equals("see")){
            System.out.println(vehicle.getName()+" Specs \n Body Type: " + vehicle.getBodyType()+ "\n HP: " + vehicle.getHp() + "\n Torque: " + vehicle.getTorque() +"\n Max Speed: " + vehicle.getMaxSpeed());
        }
        else if (scanner.hasNextLine()){
            System.exit(1);
        }


    }
    //Git connection Test
}
    