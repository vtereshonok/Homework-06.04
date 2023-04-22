/* 1 Создать класс Car c приватными полями, двумя конструкторами,
        aксессорами для полей и методом(процедурой) out
        для вывода всех полей класс на консоль */

public class Test {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A400", 2008);
        Car car2 = new Car("Volvo", "XC60");

        car1.out();
        System.out.println();

        car2.setYear(2022);
        car2.out();
    }


/* 2) Создать статические(static) методы для решения основных арифметических
        операций: +, -, *, / */

public class Test2 {
    public static void main(String[] args) {
        //присваиваем значения
        int a = 9;
        int b = 3;

        // вызываем методы

        int sum = Math.add(a, b);
        int difference = Math.sub(a, b);
        int product = Math.mult(a, b);
        double quotient = Math.div(a, b);

        // выводим в консоль

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
}

/* 3) Создать логические методы, которые будут проверять условия для переданных в них 3 переменных:
        a) первая переменная больше двух остальных;
        b) первая переменная больше хотя бы одной переменной;
        c) первая переменная больше только одной переменной.

        P.S. я добавила названия зверей, чтобы было более наглядно, с абстрактным тяжело(
        Эту задачу так и не докрутила до конца
*/

public class Test3 {
    public static void main(String[] args) {
        int giraffe = 10;
        int lion = 5;
        int flamingo = 2;
       
        System.out.println("isGiraffeBiggerThanLionAndFlamingo: " + isGiraffeBiggerThanLionAndFlamingo(giraffe, lion, flamingo));
        System.out.println("isGiraffeBiggerThanAtLeastOneFlamingo: " + isGiraffeBiggerThanAtLeastOneFlamingo(giraffe, lion, flamingo));
        System.out.println("isGiraffeBiggerThanOnlyOneLion: " + isGiraffeBiggerThanOnlyOneLion(giraffe, lion, flamingo));
    }

}
