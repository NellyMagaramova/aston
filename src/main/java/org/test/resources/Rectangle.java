package org.test.resources;

public class Rectangle extends Shape{
    double width, height;
    String fillColor;
    String borderColor;

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public double computeArea() {
         return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void info() {
        System.out.println("Периметр: " + perimeter()+", "+ "площаль" + computeArea() + "цвет фона" + fillColor + ", " +
                "цвет границы" + borderColor);
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
}
