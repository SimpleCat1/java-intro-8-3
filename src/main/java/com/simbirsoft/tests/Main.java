package com.simbirsoft.tests;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Person person1 = new Person("AAAAAAAAAAAAAAAA", 20);
        Person person2 = new Person();
        System.out.println(cat1.getYear());
        person1.animalSay();
        person2.animalSay();
        person1.tellsWhatYouAreMadeOf();
        cat1.setYear(15);
        System.out.println(cat1.getYear());
        cat1.animalSay();
    }
}
