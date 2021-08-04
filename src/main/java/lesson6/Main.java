package lesson6;

public class Main
{
        public static void main(String[] args)
        {
           Cat cat = new Cat("Cat Barsik", 200,0);
           Dog dog = new Dog("Dog Bud", 500, 10);

            System.out.println("==== START ====");

           cat.speak();
           cat.run(200);
           cat.swim(0);

            System.out.println("===============");

           dog.speak();
           dog.run(500);
           dog.swim(10);

            System.out.println("==== FINAL ====");

        }

}
