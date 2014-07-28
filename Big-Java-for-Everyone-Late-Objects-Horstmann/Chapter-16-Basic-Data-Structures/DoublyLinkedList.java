import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    private static class Node {
        Object data;
        Node previous;
        Node next;

        Node(Node previous, Object data, Node next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }
    }

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public Object getFirst() {
        if (this.first == null) {
            throw new NoSuchElementException();
        }
        return this.first.data;
    }

    public Object removeFirst() {
        if (this.first == null) {
            throw new NoSuchElementException();
        }
        Object data = this.first.data;
        this.first = this.first.next;
        if (this.first == null) {
            this.last = null;
        } else {
            this.first.previous = null;
        }
        return data;
    }

    public void addFirst(Object element) {
        Node newNode = new Node(null, element, this.first);
        if (this.first == null) {
            this.last = newNode;
        } else {
            this.first.previous = newNode;
        }
        this.first = newNode;
    }

    public Object getLast() {
        if (this.last == null) {
            throw new NoSuchElementException();
        }
        return this.last.data;
    }

    public Object removeLast() {
        if (this.last == null) {
            throw new NoSuchElementException();
        }
        Object data = this.last.data;
        this.last = this.last.previous;
        if (this.last == null) {
            this.first = null;
        } else {
            this.last.next = null;
        }
        return data;
    }

    public void addLast(Object element) {
        Node newNode = new Node(this.last.previous, element, null);
        if (this.last == null) {
            this.first = newNode;
        } else {
            this.last.next = newNode;
        }
        this.last = newNode;
    }

    public ListIterator listIterator() {
        return new DoublyLinkedListIterator();
    }

    class DoublyLinkedListIterator implements ListIterator {
        private Node position;
        private boolean isAfterPrevious;
        private boolean isAfterNext;

        public DoublyLinkedListIterator() {
            this.position = null;
            this.isAfterPrevious = false;
            this.isAfterNext = false;
        }

        @Override
        public boolean hasNext() {
            if (this.position == null) {
                return DoublyLinkedList.this.first != null;
            }
            return this.position.next != null;
        }

        public boolean hasPrevious() {
            return this.position != null;
        }

        @Override
        public Object next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            Object data = this.position.data;
            this.position = this.position.next;
            this.isAfterNext = true;
            this.isAfterPrevious = false;
            if (this.position == null) {
                this.position = DoublyLinkedList.this.first;
            } else {
                this.position = this.position.next;
            }
            return data;
        }

        @Override
        public void add(Object element) {
            if (this.position == null) {
                DoublyLinkedList.this.addFirst(element);
                this.position = DoublyLinkedList.this.first;
            } else {
            }
            this.isAfterNext = false;
            this.isAfterPrevious = false;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub

        }

        @Override
        public void set(Object element) {
            // TODO Auto-generated method stub

        }

    }
}
