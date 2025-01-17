
# 2019-2020 Design Patterns

# AutoSS

## Statement of Work:
AutoSS (AUTOMOBILE SELLING SYSTEM) provide recognizing automobiles which customers want from car seller. The automobile which customer wants to purchase produced by the factory then tested and delivered by showroom to customer via AutoSS software. There are defined 4 types of vehicle and 4 types of different car brand in the system. Each factory produces its own brand car types. Automobiles produced by different firms but actually they have same structure. All of them have engine, chassis, transmission also they have different features at their structure like torque, hp, body type and their maximum speed different from each other. The software includes these vehicle specifications. If customers wants to see specifications of the car purchased car seller would show specifications to them via typing “see” word to terminal.

## Design Pattern:
Factory pattern selected to solve the problem defined on above. the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. Defined on above all vehicles have same structure. The showroom class that requires a Vehicle object doesn't instantiate subclasses of Vehicle class directly. Instead, the Showroom refers to a separate produceVehicle() to create a vehicle object, which makes the Showroom independent of which concrete class is instantiated. Subclasses of Showroom can redefine which class to instantiate. In this example, subclasses of Showroom class implements the abstract produceVehicle() by instantiating the subclasses of the Vehicle class. Also when different types of cars object creating not needed to create specifications every time. We can create variables in Vehicle class which define vehicle specifications then we assign the value to variables in subclasses of Vehicle class. In that way also could be avoided duplicate code.

***UML***
[![UML](https://i.imgyukle.com/2020/04/24/QfjZcP.jpg)]()
