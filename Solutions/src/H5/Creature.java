package H5;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

abstract class Creature implements Cloneable {

    String name;

    String describe() {
        return name;
    }
    
    static LinkedList<Creature> toLinkedList0(ArrayList<Creature> pets) {
        LinkedList<Creature> list = new LinkedList<>();
        for (Creature pet : pets) {
            list.add(pet);
        }
        return list;
    }

    static LinkedList<Creature> toLinkedList1(ArrayList<Creature> pets) {
        LinkedList<Creature> list = new LinkedList<>();
        list.addAll(pets);
        return list;
    }

    static LinkedList<Creature> toLinkedList2(List<Creature> pets) {
        LinkedList<Creature> list = new LinkedList<>();
        list.addAll(pets);

        return list;
    }

    static LinkedList<Creature> toLinkedList2(Collection<Creature> pets) {
        LinkedList<Creature> list = new LinkedList<>();
        list.addAll(pets);
        return list;
    }

    static <T extends Creature> LinkedList<T> toLinkedList3(Collection<T> pets) {
        LinkedList<T> list = new LinkedList<>();
        list.addAll(pets);
        return list;
    }

    static <T extends Creature> LinkedList<T> toLinkedList4(Collection<T> pets) {

        return new LinkedList<>(pets);
    }
}

class Country {

    String name;
    double size;

    // 'normal' constructor
    Country(String name, double size) {
        this.name = name;
        this.size = size;
    }

    // copy constructor, used in clone()
    Country(Country that) {
        this.name = that.name;
        this.size = that.size;
    }

    @Override
    public Country clone() throws CloneNotSupportedException {
        return new Country(this);
    }
}

class Human extends Creature implements Cloneable {

    private Country country;
    private LocalDate dob;

    Human(String name, Country country, LocalDate dob) {
        this.name = name;
        this.country = country;
        this.dob = dob;
    }

    Human(Human that) throws CloneNotSupportedException {
        this.name = that.name;
        this.country = that.country;
        this.dob = new LocalDate(dob.year, dob.month, dob.date);
    }

    @Override
    public String describe() {
        return "A human named " + name + ", borne " + dob;
    }

    @Override
    public Human clone() throws CloneNotSupportedException {
        Human miniMe = new Human(this);
        return miniMe;
    }
}

class Dog extends Creature {

    Dog(String name) {
        this.name = name;
    }

    @Override
    public String describe() {
        return "A dog named " + name;
    }

}

class Rabbit extends Creature {

    Rabbit(String name) {
        this.name = name;
    }

    @Override
    public String describe() {
        return "A rabbit named " + name;
    }

}
