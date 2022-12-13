package interface_comparable;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.speed + " " + this.price + " " + this.model + " " + this.color;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            int tempPrice = this.price - ((Car)o).price;
            if (tempPrice == 0) {
                int tempModel = this.model.compareTo(((Car)o).model);
                if (tempModel == 0) {
                    return this.color.compareTo(((Car)o).color);
                }
                else return tempModel;
            }
            else return this.price - ((Car)o).price;
        } else {
            return temp;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}