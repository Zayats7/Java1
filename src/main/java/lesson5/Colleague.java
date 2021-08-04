package lesson5;

import java.util.Scanner;

public class Colleague
{
    String name;
    String position;
    String email;
    String phone;
    int wages;
    int age;

    public Colleague(String name, String position, String email, String phone, int wages, int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }

    void Get()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tEnter Colleague Name: ");
        name = sc.nextLine();

        System.out.print("\n\tEnter Colleague Position: ");
        position = sc.nextLine();

        System.out.print("\n\tEnter Colleague E-mail: ");
        email = sc.nextLine();

        System.out.print("\n\tEnter Colleague Telephone: ");
        phone = sc.nextLine();

        System.out.print("\n\tEnter Colleague Wages: ");
        wages = Integer.parseInt(sc.nextLine());

        System.out.print("\n\tEnter Colleague Age: ");
        age = Integer.parseInt(sc.nextLine());
    }

    void Put()
    {
        System.out.print("\n\tColleague Name: " + name);
        System.out.print("\n\tColleague Position: " + position);
        System.out.print("\n\tColleague E-mail: " + email);
        System.out.print("\n\tColleague Telephone: " + phone);
        System.out.print("\n\tColleague Wages: " + wages);
        System.out.println("\n\tColleague Age: " + age);
    }

    @Override
    public String toString()
    {
        return String.format("Name: %s \nPosition: %s \nE-mail: %s \n Phone: %s \n Wages: %d \n Age: %d \n",
                name, position, email, phone, wages, age);
    }

    public void print()
    {
        System.out.println(this);
    }

}
