package org.test.resources;

public class Circle extends Shape{
    double radius;
    String fillColor;
    String borderColor;

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void info() {
        System.out.println("Периметр: " + perimeter()+", "+ "площаль" + computeArea() + "цвет фона" + fillColor + ", " +
                "цвет границы" + borderColor);
    }
}
