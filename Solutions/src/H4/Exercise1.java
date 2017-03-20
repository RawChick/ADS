package H4;

import Tools.Console;
import Tools.Exercise;

import java.util.ArrayList;

class Exercise1 extends Exercise {

    public Exercise1(String title) {
        super(title);
    }

    @Override
    public String getTitle() {
        return "My Pets";
    }

    @Override
    public void test() {

        ArrayList<Pet> pets = new ArrayList<>();

        Dog fido = new Dog("Fido");
        Rabbit flopsy = new Rabbit("Flopsy");

        pets.add(fido);
        pets.add(flopsy);
        pets.add(new Rabbit("Peter"));

        for(Pet pet: pets) {
            Console.writeLine("A " + pet.getSpeciesAndName());
        }
        Console.writeLine();
    }
}
