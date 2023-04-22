
/* 3) Создать логические методы, которые будут проверять условия для переданных в них 3 переменных:
        a) первая переменная больше двух остальных;
        b) первая переменная больше хотя бы одной переменной;
        c) первая переменная больше только одной переменной.

        P.S. я добавила названия зверей, чтобы было более наглядно, с абстрактным тяжело(
*/

public class Zoo {

    public static boolean isGiraffeBiggerThanLionAndFlamingo(int giraffe, int lion, int flamingo) {
        return giraffe > lion && giraffe > flamingo;
    }

    public static boolean isGiraffeBiggerThanAtLeastOneFlamingo(int giraffe, int lion, int flamingo) {
        return giraffe > lion || giraffe > flamingo;
    }

    public static boolean isGiraffeBiggerThanOnlyOneLion(int giraffe, int lion, int flamingo) {
        return (giraffe > lion && giraffe <= flamingo) || (giraffe > flamingo && giraffe <= lion);
        }
    }
