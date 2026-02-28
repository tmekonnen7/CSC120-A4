/**
 *This is the Engine class and it consists of information about the fuel type, and current and maximum fuel levels.
 *It implements the engine requirements interface.
 *It is responsible for refueling, consumption of fuel, and reporting fuel status.
 */
public class Engine implements EngineRequirements {

    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    //constructor
    public Engine(FuelType fuelType, double currentFuelLevel, double maxFuelLevel) {
    this.fuelType = fuelType;
    this.currentFuelLevel = currentFuelLevel;
    this.maxFuelLevel = maxFuelLevel;
    }

    public void refuel(){
        this.currentFuelLevel =  this.maxFuelLevel;
    }
    
    public double getCurrentFuel(){
        return this.currentFuelLevel;
    }

    public double getMaxFuel(){
        return this.maxFuelLevel;
    }

    public FuelType getFuelType(){
        return this.fuelType;
    }

    public Boolean go(){

        System.out.println("Remaining Fuel: "+ this.currentFuelLevel);

        if (this.currentFuelLevel>= 10.0) {
            this.currentFuelLevel -= 10.0;
            return true;
        } else{
            return false;
        }
        }
    
       
     public static void main(String[] args) {
       Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0, 100.0);
       while (myEngine.go()) {
           System.out.println("Choo choo!");
       }
       System.out.println("Out of fuel.");
   }
    }
    
