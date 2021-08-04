package lesson3;

public class HomeWork3
{
    public static void main(String[] args)
    {
        task1();
        System.out.println("\n**********************");
        task2(100);
        System.out.println("\n**********************");
        int[] array1 = {1, 7, 3, 17, 15, 4, 5, 2, 4, 8, 9, 2};
        task3(array1);
        System.out.println("\n**********************");
        task4();
        System.out.println("\n**********************");
        task5(5,1);
        System.out.println("\n**********************");
        int[] array2 = {1, 7, 3, 17, 15, 4, 5, 2, 4, 8, 9, 2};
        task6(array2);
        System.out.println("\n**********************");
        int[] array7 = {7, 7, 7, 7};
        System.out.println(task7(array7));
        System.out.println("\n**********************");
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void task1()
    {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Before Rep: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nAfter Rep:  ");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void task2(int size)
    {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void task3(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 6)
            {
                arr[i] = arr[i]*2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void task4()
    {
        int[][] arr = new int [3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (i == j)
                {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
    // каждая ячейка которого равна initialValue;
    public static void task5(int len, int initialValue)
    {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
        {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void task6( int[] arr)
    {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean task7( int[] arr)
    {
        int rSum = 0;
        int lSum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            rSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++)
        {
            lSum += arr[i];
            if (lSum == rSum - lSum)
            {
                return true;
            }
        }
        return false;
    }
    //**Примеры:
    //checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    //checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    //граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

}
