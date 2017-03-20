package H5;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

class BKnoop<E> {
    private E data;
    private BKnoop<E> leftChild;
    private BKnoop<E> rightChild;
}

class NKnoop<E> {
    private final E element;
    private final List<NKnoop<E>> children;
    
    NKnoop(E element) {
        this.element = element;
        children = new LinkedList<>();
    }
    
    void addChild(NKnoop child) {
        children.add(child);
    }
}

class Persoon {
    private String name;
    private Date born;
    private Date died;
    Persoon(String name, Date born) {
        this.name = name;
        this.born = born;
    }
    void die() {
        died = new Date();
}
class Stamboom {
    NKnoop<Persoon> stam;
}}
/*
Maak een voorbeeld Stamboom
Voeg methoden (met String output) toe om:
alle kinderloze personen op te vragen.
alle overleden personen op te vragen.
gegeven een persoon, zijn moeder op te vragen.
gegeven een persoon, zijn neefjes en nichtjes op te vragen.

*/