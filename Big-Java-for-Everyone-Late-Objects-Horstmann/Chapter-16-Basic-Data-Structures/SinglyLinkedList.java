import java.util.NoSuchElementException;

public class SinglyLinkedList {
    private Node first;

    static class Node {
        private Object data;
        private Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public SinglyLinkedList() {
        this.first = null;
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
        return data;
    }

    public void addFirst(Object element) {
        Node newNode = new Node(element, this.first);
        this.first = newNode;
    }

    public ListIterator listIterator() {
        return new SinglyLinkedListIterator();
    }

    class SinglyLinkedListIterator implements ListIterator {
        private Node position;
        private Node previous;
        private boolean isAfterNext;

        @Override
        public boolean hasNext() {
            if (this.position == null) {
                return SinglyLinkedList.this.first != null;
            }
            return this.position.next != null;
        }

        @Override
        public Object next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            this.previous = this.position;
            this.isAfterNext = true;
            if (this.position == null) {
                this.position = SinglyLinkedList.this.first;
            } else {
                this.position = this.position.next;
            }
            return this.position.data;
        }

        @Override
        public void add(Object element) {
            if (this.position == null) {
                SinglyLinkedList.this.addFirst(element);
                this.position = SinglyLinkedList.this.first;
            } else {
                Node newNode = new Node(element, this.position.next);
                this.position.next = newNode;
                this.position = newNode;
            }
            this.isAfterNext = false;
        }

        @Override
        public void remove() {
            if (!this.isAfterNext) {
                throw new IllegalStateException();
            }
            if (this.position == SinglyLinkedList.this.first) {
                SinglyLinkedList.this.removeFirst();
            } else {
                this.previous.next = this.position.next;
            }
            this.position = this.previous;
            this.isAfterNext = false;
        }

        @Override
        public void set(Object element) {
            if (!this.isAfterNext) {
                throw new IllegalStateException();
            }
            this.position.data = element;
        }

    }
}
