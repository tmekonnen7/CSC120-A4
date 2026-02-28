/**
 *This is the Passenger class and it represents one individual riding the train.
 *It implements the passenger requirements interface.
 *Each passenger has a name, and can board and get removed from a car within a train, complemented with the car class.
 *@author Tensae Mekonnen
 */
public class Passenger implements PassengerRequirements{
    
    private String name;

    public Passenger(String name) {
        name = this.name;
    }

    public void boardCar(Car c){
        c.addPassenger(this);

    }

    public void getOffCar(Car c){
        c.removePassenger(this);
        
    }

    public String toString(){
        return this.name;
    }
}
