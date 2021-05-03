public class SalesCommission {
    private final int standardSalary = 200;
    private int sales;
    private int[] frequency = new int[9];

    public void collectSales(int sales) {
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    public int getGrossSalary() {
        return (int) (standardSalary + (0.09 *  getSales()));
    }

    public void setGrossSalaryFrequency() {
        switch (getGrossSalary()/100){
            case 2 -> ++frequency[0];
            case 3 -> ++frequency[1];
            case 4 -> ++frequency[2];
            case 5 -> ++frequency[3];
            case 6 -> ++frequency[4];
            case 7 -> ++frequency[5];
            case 8 -> ++frequency[6];
            case 9 -> ++frequency[7];
            default -> ++frequency[8];
        };
    }

    public int[] getGrossSalaryFrequency() {
        return frequency;
    }
}
