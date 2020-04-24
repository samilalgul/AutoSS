package ceng.anadolu.bim492.Vehicles;

public abstract class Vehicle {
    public String name;
    public String bodyType;
    public String torque;
    public String hp;
    public String maxSpeed;

    public void assemble(){
        System.out.println("Assembling: " + name);
        System.out.println("Chasis");
        System.out.println("Setting Engine Transmission up ");
        System.out.println("Outer Body");
    }

    public void test(){
        System.out.println("Start Testing");
        System.out.println("Tests are successfully ending...");
    }

    public void deliver(){
        System.out.println("Car delivered to customer.");
    }

    public String getName() {return name;}
    public String getBodyType() {return bodyType;}

    public String getTorque() {
        return torque;
    }

    public String getHp() {
        return hp;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }
}
