public class SodaCan implements Measurable {
    private double height;
    private double radius;

    public SodaCan(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getSurface() {
        return 2 * Math.PI * this.radius * this.radius + 2 * Math.PI * this.radius * this.height;
    }

    public double getVolume() {
        return Math.PI * this.radius * this.radius * 2 * this.height;
    }

    public double getMeasure() {
        return this.getSurface();
    }
}
