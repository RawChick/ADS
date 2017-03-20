package H4;

import Tools.Exercise;

import java.util.ArrayList;

class Exercise3 extends Exercise {

    public Exercise3(String title) {
        super(title);
    }

    @Override
    public String getTitle() {
        return "Convert collection to array";
    }

    @Override
    public void test() {
        ArrayList<Rabbit> rabbits = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();

        rabbits.add(new Rabbit("Fluffy"));
        rabbits.add(new Rabbit("Peter"));
        rabbits.add(new Rabbit("Jack"));

        dogs.add(new Dog("Brian"));
        dogs.add(new Dog("Gromit"));
        dogs.add(new Dog("Лайка"));
        dogs.add(new Dog("Pluto"));

        pets.addAll(dogs);
        pets.addAll(rabbits);

        Pet[] r1 = convert(pets);
        //Dog[] r2 = convert(dogs);
        //Pet[] r3 = convert(dogs);

//        Pet[] s1 = convertA(pets);
//        Dog[] s2 = convertA(dogs);
//        Pet[] s3 = convertA(dogs);

    }

    // convert Collection of Pet to array of Pet
    Pet[] convert(ArrayList<Pet> src) {
        Pet[] dst = new Pet[src.size()];
        int i = 0;
        for(Pet pet: src) {
            dst[i++] = pet;
        }
        return dst;
    }

//    // convert Collection of a certain Pet to array of that same Pet
//    <T> T[] convertA(ArrayList<T> src) {
//        T[] dst = new T[src.size()];
//        int i = 0;
//        for(T pet: src) {
//            dst[i++] = pet;
//        }
//        return dst;
//    }
//
//    // convert Collection of a certain Pet to array of that same Pet
//    <T extends Pet> T[] convertB(ArrayList<T> src) {
//        Pet[] dst = new Pet[src.size()];
//        int i = 0;
//        for(T pet: src) {
//            dst[i++] = pet;
//        }
//        return dst;
//    }
//
//    // convert Collection of a certain Pet to array of that same Pet
//    <T extends Pet> T[] convertC(ArrayList<T> src) {
//        //T[] dst = (T[])new Pet[src.size()];
//        Pet[] dst = new Pet[src.size()];
//        int i = 0;
//        for(T pet: src) {
//            dst[i++] = pet;
//        }
//        return dst;
//    }
//    // convert Collection of a certain Pet to array of that same Pet
//    <T extends Pet> T[] convertD(T[] dst, ArrayList<T> src) {
//        int i = 0;
//        for(T pet: src) {
//            dst[i++] = pet;
//        }
//    }
}
