package H6;

import java.util.*;

class NNode<E> {

    E data;
    List<NNode<E>> children;

    NNode(E data) {
        this.data = data;
        children = new LinkedList<>();
    }

    void addChild(NNode<E> child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

class Person {

    String name;
    Date born;
    Date died;

    Person(String name, int y, int m, int d) {
        this.name = name;
        this.born = new Date(y, m, d);
        this.died = null;
    }

    void die(Date date) {
        died = date;
    }

    @Override
    public String toString() {
        String r = String.format("%s (%td-%tm-%ty)", name, born, born, born);
        if (died != null) {
            r += String.format(" [†%td-%tm-%ty]", died, died, died);
        }
        return r;
    }
}

class FamilyTree {

    NNode<Person> root;

    FamilyTree(NNode<Person> root) {
        this.root = root;
    }

    NNode<Person> findParent(NNode<Person> node) {
        return _findParent(root, node);
    }

    // is parent the parent of node?
    private NNode<Person> _findParent(NNode<Person> parent, NNode<Person> node) {
        if (parent.children.contains(node)) {
            return parent;
        }
        for (NNode<Person> child : parent.children) {
            NNode<Person> p = _findParent(child, node);
            if (p != null) {
                return p;
            }
        }
        return null;
    }

    List<NNode<Person>> getOrphans() {
        List<NNode<Person>> orphans = new ArrayList<>();
        _getOrphans(root, orphans);
        return orphans;
    }

    private void _getOrphans(NNode<Person> node, List<NNode<Person>> result) {
        if (node.data.died != null) {
            result.addAll(node.children);
        }
        for (NNode<Person> child : node.children) {
            _getOrphans(child, result);
        }
    }

    NNode<Person> find(String name) {
        return _find(root, name);
    }

    private NNode<Person> _find(NNode<Person> node, String name) {
        if (node.data.name.equals(name)) {
            return node;
        }
        for (NNode<Person> child : node.children) {
            NNode<Person> p = _find(child, name);
            if (p != null) {
                return p;
            }
        }
        return null;
    }

    void show() {
        _show(root, 0);
    }

    private void _show(NNode<Person> node, int level) {
        for (int i = 0; i < level; i++) {
            Console.write("  ");
        }
        Console.writeLine(" " + node.toString());
        for (NNode<Person> child : node.children) {
            _show(child, level + 1);
        }
    }
}
