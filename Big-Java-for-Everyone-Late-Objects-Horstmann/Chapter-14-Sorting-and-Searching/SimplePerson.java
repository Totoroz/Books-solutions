public class SimplePerson implements Comparable<SimplePerson> {
    private String name;

    public SimplePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(SimplePerson o) {
        if (this.name.compareTo(o.name) == 1) {
            return 0;
        } else if (this.name.compareTo(o.name) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
