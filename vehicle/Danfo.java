import java.util.Scanner;

public class Danfo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the name and color of vehicle?");
        Vehicle danfo = new Vehicle(input.nextLine(), input.nextLine());      
        System.out.println("The name of vehicle is " + danfo.getVehicleName() + " and the color is " + danfo.getVehicleColor());
        
        if(!danfo.ignitionIsOn()){            
            System.out.println("The " + danfo.getVehicleName() + " is currently not on ignition");
        }

        System.out.println("Press 1 to turn on the ignition and 2 to turn off ignition");

        int danfoIgnitionControl = input.nextInt();

        if(danfoIgnitionControl != 1 && danfoIgnitionControl != 2){
            System.out.println("Guy, press 1 to turn on ignition and 2 to turn it off. Oya, start again!");
            return;  
        }
         
        if(danfoIgnitionControl == 1){
            danfo.setIgnition(true);
            System.out.println("The ignition is turned on");
        }else if(danfoIgnitionControl == 2){
            danfo.setIgnition(false);
            System.out.println("The ignition is turned off"); 
            return;
        }


        if(danfo.getCurrentGear() == 5){
            System.out.println(danfo.getVehicleName() + " is Neutral");
        }

        System.out.println("Set your vehicle gear");
        int vehicleGear = input.nextInt();
        String theGear = "";
        switch(vehicleGear){
            case 1 :
                theGear = "Drive";
                break; 
            case 2 :
                theGear = "Reverse";
                break; 
            case 3 :
                theGear = "Left";
                break; 
            case 4 :
                theGear = "Right";
                break; 
            case 5 :
                theGear = "Neutral";
                break; 
            default: 
                theGear = "You can only change gears within the range of 1 and 5";    
        }
       
        danfo.setGear(vehicleGear);        
        
        System.out.println("Current direction of " + danfo.getVehicleName() + "is " + theGear);
        
        System.out.println("Current speed is " + danfo.getSpeed() + " KMPH");
        
        System.out.println("Set the speed of " + danfo.getVehicleName());
        
        danfo.setSpeed(input.nextInt());

        System.out.println("Current speed is " + danfo.getSpeed() + " KMPH");

        System.out.println("Increase " + danfo.getVehicleName() + " speed");

        danfo.increaseSpeed(danfo.getSpeed());

        System.out.println("Current speed is " + danfo.getSpeed()+ " KMPH");

        System.out.println("Decrease " + danfo.getVehicleName() + " speed");

        danfo.decreaseSpeed(danfo.getSpeed());

        System.out.println("Current speed is " + danfo.getSpeed()+ " KMPH");

    }
}
