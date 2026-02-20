package org.example.exercises.part3.rectangle;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(7.5);
        rectangle1.setHeight(4.2);

        System.out.println("Rectangle 1:");
        System.out.println("Rectangle: Width = " + rectangle1.getWidth() +
                ", Height = " + rectangle1.getHeight() +
                ", Area = " + rectangle1.calculateArea() +
                ", Perimeter = " + rectangle1.calculatePerimeter());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(5.5);
        rectangle2.setHeight(4.5);

        System.out.println("Rectangle 2:");
        System.out.println("Rectangle: Width = " + rectangle2.getWidth() +
                ", Height = " + rectangle2.getHeight() +
                ", Area = " + rectangle2.calculateArea() +
                ", Perimeter = " + rectangle2.calculatePerimeter());
    }
}


