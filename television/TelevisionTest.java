import java.util.Scanner;

public class TelevisionTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of the manufacturer and size of TV?");
        Television type = new Television(input.next(), input.nextInt(), 1);      
        System.out.println("The name of manufacturer is " + type.getProductName() + " and the size is " + type.getProductSize() + " inches");
        
        if(!type.getIsTvOn()){            
            System.out.println("The TV is switched off");
        }

        System.out.println("Press 1 to turn on the TV and 2 to turn it off");

        int tvControl = input.nextInt();

        if(tvControl != 1 && tvControl != 2){
            System.out.println("Guy, press 1 to turn on the TV and 2 to turn it off. Oya, start again!");
            return;  
        }
         
        if(tvControl == 1){
            type.setIsTvOn(true);
            System.out.println("The TV is turned on");
        }else if(tvControl == 2){
            type.setIsTvOn(false);
            System.out.println("The TV is turned off"); 
            return;
        }


        if(type.getChannel() == 1){
            System.out.println("Current channel is AIT");
        }

        System.out.println("Set to your preferred channel");
        int channelValue = input.nextInt();
        String station = "";
        switch(channelValue){
            case 1 :
                station = "AIT";
                break; 
            case 2 :
                station = "ESPN";
                break; 
            case 3 :
                station = "ROK 2";
                break; 
            case 4 :
                station = "TBN";
                break; 
            case 5 :
                station = "Cartoon Network";
                break; 
            case 6 :
                station = "CNN";
                break; 
            case 7 :
                station = "STV";
                break; 
            case 8 :
                station = "Nick Junior";
                break;  
            case 9 :
                station = "Studio Universal";
                break; 
            case 10 :
                station = "Wazobia Max TV";
                break; 
            default: 
                station = "Channel does not exist!!! Please type numbers from 1 to 10 for stations";    
        }
       
        type.setChannel(channelValue);        
        
        System.out.println("Current channel is " + station);
        
        System.out.println("Current volume is " + type.getVolume());
        
        System.out.println("Set the volume of the television");
        
        type.setVolume(input.nextInt());

        System.out.println("Current volume is " + type.getVolume());

        System.out.println("Increase TV volume");

        type.increaseVolume(type.getVolume());

        System.out.println("Current volume is " + type.getVolume());

        System.out.println("Decrease TV volume");

        type.decreaseVolume(type.getVolume());

        System.out.println("Current volume is " + type.getVolume());

    }
}
