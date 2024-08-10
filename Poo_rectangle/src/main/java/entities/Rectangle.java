package entities;

public class Rectangle {

    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width * 2) + (height * 2);
    }

    public double diagonal() {
        return Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
    }

}
