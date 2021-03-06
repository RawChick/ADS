package H4;

import Tools.Console;
import Tools.Exercise;

import java.util.ArrayList;
import java.util.Collections;

class Exercise2 extends Exercise {

    public Exercise2(String title) {
        super(title);
    }

    @Override
    public String getTitle() {
        return "Sort pets by name";
    }

    @Override
    public void test() {
        ArrayList<Rabbit> rabbits = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        rabbits.add(new Rabbit("Fluffy"));
        rabbits.add(new Rabbit("Peter"));
        rabbits.add(new Rabbit("Jack"));

        dogs.add(new Dog("Brian"));
        dogs.add(new Dog("Gromit"));
        dogs.add(new Dog("Лайка"));
        dogs.add(new Dog("Pluto"));

        ArrayList<Pet> pets = new ArrayList<>();

        pets.addAll(dogs);
        pets.addAll(rabbits);

        Console.writeLine("Unsorted: " + Pet.getNameList(pets) + ".");

        Collections.sort(pets);

        Console.writeLine("Sorted: " + Pet.getNameList(pets) + ".");

        Console.writeLine();
    }
}
