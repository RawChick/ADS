package H5;

import java.util.ArrayList;
import java.util.LinkedList;

class Exercise1 extends Exercise {

    @Override
    String getTitle() {
        return "Creature reproducer";
    }

    @Override
    void test() {

        ArrayList<Creature> pets = new ArrayList<>();
        LinkedList<Dog> dogs = new LinkedList<>();
        
        Dog fido = new Dog("Fido");
        Dog brian = new Dog("Brian");
        Dog snoopy = new Dog("Snoopy");

        Rabbit peter = new Rabbit("Peter");
        Rabbit flopsy = new Rabbit("Flopsy");
        
        pets.add(fido);
        pets.add(brian);
        pets.add(snoopy);
        pets.add(peter);
        pets.add(flopsy);
        
        dogs.add(fido);
        dogs.add(brian);
        //dogs.add(flopsy);

        Console.writeLine("My pets:");
        for(Creature pet: pets) {
            Console.writeLine(pet.describe());
        }
        
        Console.writeLine("My pets:");
        
        Console.writeLine();
    }
}

