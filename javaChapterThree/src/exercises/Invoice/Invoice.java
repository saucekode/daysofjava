package exercises.Invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public String getPartNumber(){
        return partNumber;
    }

    public void setPartNumber(String newPartNumber){
        partNumber = newPartNumber;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public void setPartDescription(String newPartDescription){
        partDescription = newPartDescription;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int newQuantity){
        if(newQuantity < 0){
            newQuantity = 0;
        }
        quantity = newQuantity;

    }

    public double getPrice(){
        return pricePerItem;
    }

    public void setPrice(double newPricePerItem){
        if(newPricePerItem < 0){
            newPricePerItem = 0.0;
        }
        pricePerItem = newPricePerItem;
    }

    public double getInvoiceItem(){
        return quantity * pricePerItem;
    }

}
