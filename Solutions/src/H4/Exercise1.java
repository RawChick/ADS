package H4;

import java.util.ArrayList;

class Exercise1 extends Exercise {

    @Override
    String getTitle() {
        return "My Pets";
    }

    @Override
    void test() {

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
