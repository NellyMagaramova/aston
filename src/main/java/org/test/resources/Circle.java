package org.test.resources;

public class Circle implements Shape{
    private double radius;
    private String fillColor;
    private String borderColor;

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String getBorderColor(){
        return borderColor;
    }

    @Override
    public String getFillColor(){
        return fillColor;
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

    public void info() {
        System.out.println("Периметр: " + perimeter()+", "+ "площаль" + computeArea() + "цвет фона" + fillColor + ", " +
                "цвет границы" + borderColor);
    }
}
