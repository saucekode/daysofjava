package Chapter5;

import javax.swing.*;

public class CalculateSales {
    private double price;
    private int productTag;
    private double retailValue;

    public void setProductTagAndPrice(int productTag) {
        switch (productTag){
            case 1 -> price = 2.98;
            case 2 -> price = 4.50;
            case 3 -> price =  9.98;
            case 4 -> price = 4.49;
            case 5 -> price = 6.87;
//            default -> throw new IllegalStateException("Unexpected value: " + productTag);
        }
        this.productTag = productTag;
    }

    public double getProductPrice(){
        return price;
    }
    public int getProductTag(){
        return productTag;
    }

    public void calculateRetailValue(){
        double total = 0;
        int buying = Integer.parseInt(JOptionPane.showInputDialog("Enter product tag or -1 to exit app"));
        while(buying != -1){
            setProductTagAndPrice(buying);
            buying = Integer.parseInt(JOptionPane.showInputDialog("Enter product tag or -1 to exit app"));
            total += price;
        }
        this.retailValue = total;
    }

    public double getRetailValue() {
        return retailValue;
    }

    public static void main(String[] args) {
        CalculateSales sales = new CalculateSales();
        sales.calculateRetailValue();
        System.out.println("Total retail value of all products sold is: " + "$" + sales.getRetailValue());
    }
}
