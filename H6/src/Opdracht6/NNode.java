package Opdracht6;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by whees on 15-Mar-17.
 */


class NNode<E> {
    private final E data;
    private final List<NNode<E>> children;

    NNode(E data) {
        this.data = data;
        children = new LinkedList<>();
    }

    public List<NNode<E>> getChildren() {
        return children;
    }

    E getData() {
        return data;
    }

    void addChild(NNode<E> child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return data.toString();
    }


}
