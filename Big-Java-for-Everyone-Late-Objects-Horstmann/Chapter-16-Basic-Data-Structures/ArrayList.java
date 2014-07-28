public class ArrayList {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private Object[] buffer;

    public ArrayList() {
        this.size = 0;
        this.buffer = new Object[DEFAULT_SIZE];
    }

    public int size() {
        return this.size;
    }

    private void checkBounds(int n) {
        if (n < 0 || n >= this.size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public Object get(int pos) {
        this.checkBounds(pos);
        return this.buffer[pos];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void set(int pos, Object element) {
        this.checkBounds(pos);
        this.buffer[pos] = element;
    }

    public Object remove(int pos) {
        this.checkBounds(pos);
        Object removed = this.buffer[pos];
        for (int i = pos + 1; i < this.buffer.length; i++) {
            this.buffer[i - 1] = this.buffer[i];
        }
        this.size -= 1;
        return removed;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < this.buffer.length; i++) {
                if (this.buffer[i] == o) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < this.buffer.length; i++) {
                if (this.buffer[i].equals(o)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean contains(Object o) {
        return this.indexOf(o) > -1;
    }

    public boolean add(int pos, Object element) {
        this.growBufferIfNecessary();
        this.size += 1;
        this.checkBounds(pos);
        for (int i = this.size - 1; i > pos; i--) {
            this.buffer[i] = this.buffer[i - 1];
        }
        this.buffer[pos] = element;
        return true;
    }

    public boolean addLast(Object element) {
        this.growBufferIfNecessary();
        this.size += 1;
        this.buffer[this.size - 1] = element;
        return true;
    }

    private void growBufferIfNecessary() {
        if (this.size == this.buffer.length) {
            Object[] newBuffer = new Object[this.buffer.length * 2];
            for (int i = 0; i < this.buffer.length; i++) {
                newBuffer[i] = this.buffer[i];
            }
            this.buffer = newBuffer;
        }
    }
}
