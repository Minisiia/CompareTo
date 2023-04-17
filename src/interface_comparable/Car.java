package interface_comparable;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private int speed;
    private int price;
    private String model;
    private String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return this.speed + " " + this.price + " " + this.model + " " + this.color;
    }

    @Override
    public int compareTo(Car o) {
        return Comparator.comparing(Car::getSpeed)
                .thenComparing(Car::getPrice)
                .thenComparing(Car::getModel)
                .thenComparing(Car::getColor)
                .compare(this, o);
    }
}