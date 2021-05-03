// CLASS DESIGN FOR A TELEVISION

public class Television{
    
    String productName;
    int size;
    boolean tvOn;
    int channel;
    int volume;

    public Television(String productName, int size, int channel){
        this.productName = productName;
        this.size = size;
        this.channel = channel;
    }

    public String getProductName(){
        return productName;
    }    

    public void setProductName(String newProductName){
        productName = newProductName;
    }

    public int getProductSize(){
        return size;
    }

    public void setProductSize(int newSize){
        size = newSize;
    }

    public int getChannel(){
        return channel;
    }

    public void setChannel(int newChannel){
        channel = newChannel;
    }

    public boolean getIsTvOn(){
        return tvOn;
    }

    public void setIsTvOn(boolean tvOn){
        this.tvOn = tvOn;
    }
   
    public int getVolume(){
        return volume;
    }   

    public void setVolume(int newVolume){
        if(newVolume < 0 || newVolume > 100){
            System.out.println("Invalid volume value");
        }else{
            volume = newVolume;
        }
    }

    public void increaseVolume(int newVolume){
        if(newVolume < 0 || newVolume > 100){
            System.out.println("Invalid volume value");
        }else{
            newVolume++;
            volume = newVolume;
        }
    }

    public void decreaseVolume(int newVolume){
        if(newVolume < 0 || newVolume > 100){
            System.out.println("Invalid volume value");
        }else{
            newVolume--;
            volume = newVolume;
        }
    }

}
