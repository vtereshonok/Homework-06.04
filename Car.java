/* Создать класс Car c приватными полями, двумя конструкторами,
        aксессорами для полей и методом(процедурой) out
        для вывода всех полей класс на консоль */


// cоздаем класс и приватные поля

public class Car {

    private String name;
    private String model;
    private int year;

    // cоздаем крнструкторы
    // принимает все три значения
    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }
    // принимает только 2 значения
    public Car(String name, String model) {
        this(name, model);
    }

    // аксессоры
    public String getName() {
        return name;
    }
    public void  setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int  getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // выводим на консоль

    public void out() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}



