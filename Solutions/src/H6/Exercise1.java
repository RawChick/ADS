package H6;

import java.util.Date;

class Exercise1 extends Exercise {

    @Override
    String getTitle() {
        return "Family tree";
    }

    @Override
    void test() {
        NNode<Person> p01 = new NNode<>(new Person("Liam", 1920, 12, 1));
        NNode<Person> p02 = new NNode<>(new Person("Sem", 1945, 12, 2));
        NNode<Person> p03 = new NNode<>(new Person("Lucas", 1945, 12, 3));
        NNode<Person> p04 = new NNode<>(new Person("Luuk", 1945, 12, 4));
        NNode<Person> p05 = new NNode<>(new Person("Noah", 1945, 12, 5));
        NNode<Person> p06 = new NNode<>(new Person("Milan", 1978, 12, 6));
        NNode<Person> p07 = new NNode<>(new Person("Daan", 1978, 12, 7));
        NNode<Person> p08 = new NNode<>(new Person("Levi", 1978, 12, 8));
        NNode<Person> p09 = new NNode<>(new Person("Finn", 1978, 12, 9));
        NNode<Person> p10 = new NNode<>(new Person("Jesse", 1978, 12, 10));
        NNode<Person> p11 = new NNode<>(new Person("Max", 1978, 12, 11));
        NNode<Person> p12 = new NNode<>(new Person("Thomas", 1978, 12, 12));
        NNode<Person> p13 = new NNode<>(new Person("Nemo", 1978, 12, 13));
        NNode<Person> p14 = new NNode<>(new Person("Thijs", 1978, 12, 14));
        NNode<Person> p15 = new NNode<>(new Person("Sam", 2002, 12, 15));
        NNode<Person> p16 = new NNode<>(new Person("Tim", 2002, 12, 16));
        NNode<Person> p17 = new NNode<>(new Person("Lars", 2002, 12, 17));
        NNode<Person> p18 = new NNode<>(new Person("Ruben", 2002, 12, 18));
        NNode<Person> p19 = new NNode<>(new Person("Julian", 2002, 12, 19));
        NNode<Person> p20 = new NNode<>(new Person("Adam", 2002, 12, 20));
        NNode<Person> p21 = new NNode<>(new Person("Jayden", 2002, 12, 21));
        NNode<Person> p22 = new NNode<>(new Person("Mees", 2002, 12, 22));
        NNode<Person> p23 = new NNode<>(new Person("Noud", 2002, 12, 23));
        NNode<Person> p24 = new NNode<>(new Person("Gijs", 2002, 12, 24));
        NNode<Person> p25 = new NNode<>(new Person("Benjamin", 2002, 12, 25));

        p01.addChild(p02);
        p01.addChild(p03);
        p01.addChild(p04);
        p01.addChild(p05);

        p02.addChild(p06);
        p02.addChild(p07);
        p02.addChild(p08);
        p03.addChild(p09);
        p04.addChild(p10);
        p04.addChild(p11);
        p05.addChild(p12);
        p05.addChild(p13);
        p05.addChild(p14);

        p06.addChild(p14);
        p06.addChild(p15);
        p07.addChild(p16);
        p07.addChild(p17);
        p07.addChild(p18);
        p08.addChild(p19);
        p10.addChild(p20);
        p10.addChild(p21);
        p10.addChild(p22);
        p11.addChild(p23);
        p14.addChild(p24);
        p14.addChild(p25);

        
        FamilyTree ftree = new FamilyTree(p01);
        
        
        p02.data.die(new Date());
        p08.data.die(new Date());

        Console.writeLine("Tree:");
        ftree.show();
        Console.writeLine();
        
        Console.writeLine("Orphans:");
        for (NNode<Person> orphan : ftree.getOrphans()) {
            Console.writeLine(orphan.toString());
        }
        Console.writeLine();
        
        Console.writeLine("Finding Nemo:");
        NNode<Person> nemo = ftree.find("Nemo");
        if(nemo != null) {
            Console.writeLine(nemo.toString());
        }
        Console.writeLine();

        Console.writeLine("Finding Nemo's father:");
        NNode<Person> dad = ftree.findParent(nemo);
        if(dad != null) {
            Console.writeLine(dad.toString());
        }
        Console.writeLine();

    }
}
