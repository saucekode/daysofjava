// CLASS DESIGN FOR A VEHICLE

public class Vehicle{
    
    String vehicleName;
    int gear;
    int speed;
    boolean ignitionOn;
    String vehicleColor;

    public Vehicle(String vehicleName, String vehicleColor){
        this.vehicleName = vehicleName;
        this.vehicleColor = vehicleColor;
    }

    public String getVehicleName(){
        return vehicleName;
    } 

    public String getVehicleColor(){
        return vehicleColor;
    } 

    public boolean ignitionIsOn(){
        return ignitionOn;
    }    
    
    public void setIgnition(boolean ignitionOn){
        this.ignitionOn = ignitionOn;    
    }    
    
    public void setVehicleName(String newVehicleName){
        vehicleName = newVehicleName;
    }

    public int getCurrentGear(){
        return gear;
    }

    public void setGear(int newGear){
        gear = newGear;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int newSpeed){
        if(newSpeed < 0 || newSpeed > 120){
            System.out.println("Vehicle speed limit!!!");
        }else{
            speed = newSpeed;
        }

    }   

    public void increaseSpeed(int newSpeed){
        if(newSpeed < 0 || newSpeed > 120){
            System.out.println("Vehicle speed limit!!!");
        }else{
            newSpeed++;
            speed = newSpeed;
        }
    }

    public void decreaseSpeed(int newSpeed){
        if(newSpeed < 0 || newSpeed > 120){
            System.out.println("Vehicle speed limit!!!");
        }else{
            newSpeed--;
            speed = newSpeed;
        }
    }

}
