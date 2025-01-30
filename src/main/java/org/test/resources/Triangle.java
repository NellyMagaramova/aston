package org.test.resources;

public class Triangle implements Shape{
    private int a, h;
    private String fillColor;
    private String borderColor;

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

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

    @Override
    public double computeArea() {
        return (a*h)/2;
    }

    @Override
    public double perimeter() {
        return Math.pow(Math.pow(a, 2) + Math.pow(h, 2), 0.5);
    }


    public void info() {
        System.out.println("Периметр: " + perimeter()+", "+ "площаль" + computeArea() + "цвет фона" + fillColor + ", " +
                "цвет границы" + borderColor);
    }

    public Triangle(int a, int h){
        this.a = a;
        this.h = h;
    }
}
