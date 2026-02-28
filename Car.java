/**
 *This is the Car class and it consists of a maximum capacity, stores the passenger objects in an array list, and allows passengers to board and get removed. 
 *It also prints out remaining availability of seats and a full manifest of the passengers onboard.
 *It implements the car requirements interface.
 *It is responsible for reporting the total capacity, and available seating, getting the engine, managing the cars within the train, and printing the manifest.
 *@author Tensae Mekonnen
 */
import java.util.ArrayList;

public class Car implements CarRequirements{
    
    private ArrayList<Passenger> passengers; 
    private int capacity;

    public Car(int capacity){
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int seatsRemaining(){
        return this.capacity- this.passengers.size();
    }

    public Boolean addPassenger(Passenger p){
        if (this.passengers.size() < this.capacity){
            this.passengers.add(p);
            return true;
        }
        return false;
    }

    public Boolean removePassenger(Passenger p){
        if (this.passengers.contains(p)) {
            this.passengers.remove(p);
            return true;
        }
        return false;

    }
    
    public void printManifest(){
        if (this.passengers.isEmpty()){
            System.out.println("This car is EMPTY.");
        } else {
            for (Passenger p: this.passengers) {
                System.out.println(p);
            }
        }
    }

}