import java.util.ArrayList;

/*Write a method
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,
ArrayList<Integer> b)
that merges two sorted array lists, producing a new sorted array list. Keep an index
into each array list, indicating how much of it has been processed already. Each time,
append the smallest unprocessed element from either array list, then advance the
index.*/

public class P6_28 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        for (int i = 0; i < a.size() + b.size(); i++) {
            int minElementA = findMinElement(a);
            int minElementB = findMinElement(b);
            if (minElementA < minElementB) {
                mergedList.add(minElementA);
            }
            else {
                mergedList.add(minElementB);
            }
        }
        return mergedList;
    }
    
    // bad method name that doesn't explicitly say that the min element is removed afterwards
    public static int findMinElement(ArrayList<Integer> list) {
        int minElement = list.get(0);
        int minElementIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minElement) {
                minElement = list.get(i);
                minElementIndex = i;
            }
        }
        list.remove(minElementIndex);
        return minElement;
    }
    
}
