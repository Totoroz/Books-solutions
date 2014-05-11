import java.util.ArrayList;

/*Write a program that produces ten random permutations of the numbers 1 to 10. To
 generate a random permutation, you need to fill an array with the numbers 1 to 10
 so that no two entries of the array have the same contents. You could do it by brute
 force, by generating random values until you have a value that is not yet in the array.
 But that is inefficient. Instead, follow this algorithm.
 Make a second array and fill it with the numbers 1 to 10.
 Repeat 10 times
 Pick a random element from the second array.
 Remove it and append it to the permutation array.*/

public class P6_15 {
    public static void permutations(int[] seq) {
        ArrayList<Integer> tempArray = permutationNumbers();
        for (int i = 0; i < 10; i++) {
            int randPos = (int) (Math.random() * tempArray.size());
            int randElement = tempArray.get(randPos);
            tempArray.remove(randPos);
            seq[i] = randElement;
        }
    }

    public static ArrayList<Integer> permutationNumbers() {
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        tempArray.add(1);
        tempArray.add(2);
        tempArray.add(3);
        tempArray.add(4);
        tempArray.add(5);
        tempArray.add(6);
        tempArray.add(7);
        tempArray.add(8);
        tempArray.add(9);
        tempArray.add(10);
        return tempArray;
    }
}
