package org.test.resources;

public class Rectangle implements Shape{
    private double width, height;
    private String fillColor;
    private String borderColor;

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String getBorderColor(){
        return borderColor;
    }

    @Override
    public String getFillColor(){
        return fillColor;
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

    public void info() {
        System.out.println("Периметр: " + perimeter()+", "+ "площаль" + computeArea() + "цвет фона" + fillColor + ", " +
                "цвет границы" + borderColor);
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
}
