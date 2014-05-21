/*P9.15    A person has a name and a birth year. Use the average method in Section
9.6 to process a collection of Person objects.*/

public class PersonsAverage {
    public static double average(Person[] objects) {
        double sum = 0;
        for (Person person : objects) {
            sum += person.getBirthYear();
        }
        return sum / objects.length;
    }
}
