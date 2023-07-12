package OOP_Seminar4.OOP_Sem4_HT;

import java.util.Iterator;

import OOP_Seminar4.GBList;

public class GBLinkedList<T> implements GBLinked<T>, Iterable<T> {

    private Node<T> frstNode;
    private Node<T> lastNode;
    private int size = 0;

    public GBLinkedList () {
        lastNode = new Node<T>(null, frstNode, null);
        frstNode = new Node<T>(null, null, lastNode);
    }

    private class Node<T>{
        private T currEl;
        private Node<T> prevEl;
        private Node<T> nextEl;

        private Node (T currEl, Node<T> prevEl, Node<T> nextEl){
            this.currEl = currEl;
            this.prevEl = prevEl;
            this.nextEl = nextEl;
        }

        public T getCurrEl() {
            return currEl;
        }

        public void setCurrEl(T currEl) {
            this.currEl = currEl;
        }

        public Node<T> getPrevEl() {
            return prevEl;
        }

        public void setPrevEl(Node<T> prevEl) {
            this.prevEl = prevEl;
        }

        public Node<T> getNextEl() {
            return nextEl;
        }

        public void setNextEl(Node<T> nextEl) {
            this.nextEl = nextEl;
        }



    }

    @Override
    public void addLast(T t) {
        Node<T> prev = lastNode;
        prev.setCurrEl(t);
        lastNode = new Node <T>(null, prev, null);
        prev.setNextEl(lastNode);
        size++;
    }

    @Override
    public void addFrst(T t) {
        Node<T> next = frstNode;
        next.setCurrEl(t);
        frstNode = new Node <T>(null, null, next);
        next.setPrevEl(frstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getEl(int index) {
        Node<T> target = frstNode.getNextEl();
        for(int i = 0; i < index; i++){
            target = getNextNode(target);
        }
        return target.getCurrEl();
    }

    private Node<T> getNextNode(Node<T> current){
        return current.getNextEl();
    }

    public Node<T> getFrstNode() {
        return frstNode;
    }

    public void setFrstNode(Node<T> frstNode) {
        this.frstNode = frstNode;
    }

    public Node<T> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<T> lastNode) {
        this.lastNode = lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>(){
            int index = 0;
            @Override
            public boolean hasNext() {
                
                return index < size;
            }

            @Override
            public T next() {
                return getEl(index++);
            }

        };
    }

    
    
    
    
}
