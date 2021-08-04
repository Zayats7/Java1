package lesson6;

public class Dog extends Animal
{
    public Dog(String nameGet, int runLen, int swimLen)
    {
        super(nameGet, runLen, swimLen);
    }

    @Override
    void run(int length)
    {
        if ((length >= 0) && (length <= runLen))
            System.out.println("I run "+length+ " m");
        else System.out.println("Sorry, I cant run more then "+runLen+ " m");
    }

    @Override
    void swim(int length)
    {
        if ((length >= 0) && (length <= swimLen))
            System.out.println("I swim "+length+ " m");
        else System.out.println("Sorry, I cant swim more then "+swimLen+ " m");
    }

}
