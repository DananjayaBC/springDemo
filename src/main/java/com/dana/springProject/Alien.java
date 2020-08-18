package com.dana.springProject;

public class Alien
{
    private int age ;
    private Laptop laptop;

    public Alien()
    {
        System.out.println("Alien Object Created..");
    }

    public Alien(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age Assign");
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


    public void code()
    {
        System.out.println("I'm Coding....");
        laptop.complile();
    }


}
