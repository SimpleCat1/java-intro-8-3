package com.simbirsoft.tests;

public class Cat extends Animal {
    public Cat() {
        super();
        tellsWhatYouAreMadeOf();
    }

    public void tellsWhatYouAreMadeOf() {
        /*public ставим у методов и переменных , который используются у наследников основного класса потому,
        что так принято, либо Private,public ,но не Protected.Protected может стоять в основном классе
        */
        partsOfExistence.add("Левая рука");
        partsOfExistence.add("Правая рука");
        partsOfExistence.add("Правая нога");
        partsOfExistence.add("Левая нога");
        partsOfExistence.add("Хвост");
        System.out.println("Привет, я кошка, я состю из:");
        for (String unitPartsOfExistence : partsOfExistence) {
            System.out.println(unitPartsOfExistence);
        }
        System.out.println("Еще я пушистая(ый) и мне, вот столько лет " + year);
    }

    @Override
    public void setYear(int year) {
        if (year > 15) {
            System.out.println("Столько кошки не живут");
        } else if (year > 0 & year <= 15) {
            this.year = year;
        } else {
            System.out.println("Вы указали несуществующий возраст, возраст должен быть положительный или больше 0");
        }
    }
}
