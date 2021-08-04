package lesson6;

public abstract class Animal
{
  protected String nameGet;
  protected int runLen;
  protected int swimLen;

    abstract void run(int length);

    abstract void swim(int length);

    public Animal(String nameGet, int runLen, int swimLen)
    {
        this.nameGet = nameGet;
        this.runLen = runLen;
        this.swimLen = swimLen;
    }

    public void speak()
    {
        System.out.println("Hello! My name is " + nameGet);
    }

}
