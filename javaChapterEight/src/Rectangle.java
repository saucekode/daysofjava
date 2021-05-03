public class Rectangle {
    private double length = 1;
    private double width = 1;

    private void validate(double sideValue){
        if(sideValue < 0.0 || sideValue > 20.0){
            throw new IllegalArgumentException("Value should be between 0 and 20");
        }
    }

    public void setLength(double length) {
        validate(length);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(int width) {
        validate(width);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public double getArea() {
        return getLength() * getWidth();
    }
}
