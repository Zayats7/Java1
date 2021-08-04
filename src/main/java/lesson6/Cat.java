package lesson6;

public class Cat extends Animal
{
    public Cat(String nameGet, int runLen, int swimLen)
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
        if (length >0)
        System.out.println("Sorry, I cant swim");
        else
            System.out.println("I cant swim thats's i'll stay on the shore");
    }

}
