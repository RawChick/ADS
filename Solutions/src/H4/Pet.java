package H4;

import java.util.List;

abstract class Named {

    protected final String name;

    Named(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    static String getNameList(List<Pet> pets) {
        String result = "";
        for (Pet pet : pets) {
            if (result.length() > 0) {
                result += ", ";
            }
            result += pet.name;
        }
        return result;
    }

}

abstract class Pet extends Named implements Comparable<Pet> {

    Pet(String name) {
        super(name);
    }

    abstract String getSpecies();

    String getSpeciesAndName() {
        return getSpecies() + " named " + name;
    }

    @Override
    public int compareTo(Pet p) {
        return name.compareTo(p.name);
    }
}

class Dog extends Pet {

    @Override
    String getSpecies() {
        return "dog";
    }

    Dog(String name) {
        super(name);
    }
}

class Rabbit extends Pet {

    @Override
    String getSpecies() {
        return "rabbit";
    }

    Rabbit(String name) {
        super(name);
    }
}
