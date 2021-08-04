package lesson2;

public class HomeWork2
{
    public static void main(String[] args)
    {
        System.out.println(first(7, 7));
        System.out.println("**********************");
        second(7);
        System.out.println("**********************");
        System.out.println(three(-7));
        System.out.println("**********************");
        four("Alex",7);
        System.out.println("**********************");
        System.out.println(five(2021));
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.

    public static boolean first(int a, int b)
    {
        int sum = a + b;
        if (sum > 10 && sum < 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    static void second(int a)
    {
        if (a >= 0)
        {
            System.out.println("Число " + a + " положительное");
        }
        else
        {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean three(int a)
    {
        if (a < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void four(String str, int a)
    {
        for (int b = 1; b <= a; b++)
        {
            System.out.println("[" + b + "]" + " " + str);
        }
    }

    //* Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean five(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
