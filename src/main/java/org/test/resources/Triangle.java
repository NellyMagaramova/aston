package org.test.resources;

public class Triangle extends Shape{
    int a, h;
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
        return (a*h)/2;
    }

    @Override
    public double perimeter() {
        return Math.pow(Math.pow(a, 2) + Math.pow(h, 2), 0.5);
    }

    @Override
    public void info() {
        System.out.println("Периметр: " + perimeter()+", "+ "площаль" + computeArea() + "цвет фона" + fillColor + ", " +
                "цвет границы" + borderColor);
    }

    public Triangle(int a, int h){
        this.a = a;
        this.h = h;
    }
}
