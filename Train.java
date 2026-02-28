/**
 *This is the Train class and it consists of One engine, and multiple cars stored in an array.
 *It implements the train requirements interface.
 *It is responsible for reporting the total capacity, and available seating, getting the engine, managing the cars within the train, and printing the manifest.
 *@author Tensae Mekonnen
 */
import java.util.ArrayList;

public class Train implements TrainRequirements{
    Engine engine;
    ArrayList<Car> cars;

    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.cars = new ArrayList<>();

        for (int i = 0; i < nCars; i++){
            this.cars.add(new Car (passengerCapacity));
        }

    }


    public Engine getEngine(){
        return this.engine;
    }

    public Car getCar(int i){
        return this.cars.get(i);
    }

    public int getMaxCapacity(){
        int total = 0;
        
        for (Car c: this.cars){
            total += c.getCapacity();
        }

        return total;
    }

    public int seatsRemaining(){
        int totseats = 0;

        for (Car c: this.cars) {
            totseats += c.seatsRemaining();
        }

        return totseats;
    }

    public void printManifest(){
        for(Car c: this.cars){
            c.printManifest();
        }
    }


public static void main(String[] args) {
    //Creating a train with fuel type, currentFuel, maxFuel, numberOfCars, capacityPerCar
    Train train = new Train(FuelType.INTERNAL_COMBUSTION, 50.0, 100.0, 2,3);

    //Passengers created
    Passenger p1 = new Passenger ("Passenger 1");
    Passenger p2 = new Passenger ("Passenger 2");
    Passenger p3 = new Passenger ("Passenger 3");
    Passenger p4 = new Passenger ("Passenger 4");

    //Boarding passengers to the first car
    Car firstCar = train.getCar(0);
    p1.boardCar(firstCar);
    p2.boardCar(firstCar);
    p3.boardCar(firstCar);
    Car secondCar = train.getCar(1);
    p4.boardCar(secondCar);

    //Print capacity info and full manifest
    System.out.println("Total Capacity: " + train.getMaxCapacity());
    System.out.println("Seats remaining: " + train.seatsRemaining());

    System.out.println("\nTrain Manifest:");
    train.printManifest();
}
}