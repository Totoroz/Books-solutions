/*P9.14    Modify the SodaCan class of Exercise P8.5 to implement the Measurable interface.
 The measure of a soda can should be its surface area. Write a program that computes the
 average surface area of an array of soda cans.*/

public interface Measurable {
    double getMeasure();

}


/*public static Measurable maximum(Measurable[] objects) {
    Measurable largest = objects[0];
    for (int i = 1; i < objects.length; i++) {
        if (objects[i].getMeasure() > largest.getMeasure()) {
            largest = objects[i];
        }
    }
    return largest;
}*/