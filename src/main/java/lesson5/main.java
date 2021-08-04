package lesson5;

public class main
{
    public static void main(String[] args)
    {
        System.out.println("==== START ====");

        Colleague colleague = new Colleague("Zaitcev Alexei Valerevich","Testing Engineer","qwerty@icloud.com","+7-777-777-77-77",400000,21);

        System.out.println(colleague);

        System.out.println("==== Write you info ====");

        colleague.Get();

        System.out.println("\n==== Chek you info ====");

        colleague.Put();

        System.out.println("\n==== Array with filter ====");

        Colleague[] persArray = new Colleague[5];
        persArray[0] = new Colleague("Yana Rudkovskaya", "Meneger", "qwerty@icloud.com", "+7-999-999-99-99", 150000, 49);
        persArray[1] = new Colleague("Alexei Sokolov", "Testing Engineer", "qwerty@icloud.com", "+7-777-777-77-77", 400000, 47);
        persArray[2] = new Colleague("Ilya Smirnov", "Junior QA", "qwerty@icloud.com", "+7-888-888-88-88", 350000, 48);
        persArray[3] = new Colleague("Elis Zaitceva", "Teacher", "qwerty@icloud.com", "+7-555-555-55-55", 100000, 21);
        persArray[4] = new Colleague("Julia Koneva", "Bloger", "qwerty@icloud.com", "+7-111-111-11-11", 100000, 21);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

        System.out.println("=== FINISH ====");
    }

}
