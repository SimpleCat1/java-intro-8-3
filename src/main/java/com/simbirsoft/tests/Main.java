package com.simbirsoft.tests;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1.getYear());
        cat1.setYear(15);
        System.out.println(cat1.getYear());
        cat1.makeASound();

        Person person1 = new Person("AAAAAAAAAAAAAAAA", 20);
        person1.makeASound();
        person1.tellsWhatYouAreMadeOf();

        Person person2 = new Person();
        person2.makeASound();
    }
}
