
/*Write array methods that carry out the following tasks for an array of integers. For
 each method, provide a test program.
 a.   Swap the first and last elements in the array.
 b.   Shift all elements by one to the right and move the last element into the first
 position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
 c.   Replace all even elements with 0.
 d.   Replace each element except the first and last by the larger of its two neighbors.
 e.   Remove the middle element if the array length is odd, or the middle two
 elements if the length is even.
 f.   Move all even elements to the front, otherwise preserving the order of the
 elements.
 g.   Return the second-largest element in the array.
 h.   Return true if the array is currently sorted in increasing order.
 i.   Return true if the array contains two adjacent duplicate elements.
 j.   Return true if the array contains duplicate elements (which need not be adjacent).*/

public class P6_02 {
    // A
    public static void swap(int[] seq, int a_index, int b_index) {
        int temp = seq[a_index];
        seq[a_index] = seq[b_index];
        seq[b_index] = temp;
    }

    // B
    public static void shift(int[] seq) {
        int last = seq[seq.length - 1];
        System.arraycopy(seq, 0, seq, 1, seq.length - 1);
        seq[0] = last;
    }

    // C
    public static void replace(int[] seq, int replacement) {
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] % 2 == 0) {
                seq[i] = replacement;
            }
        }
    }

    // D
    public static int[] replaceByNeighBours(int[] seq) {
        for (int i = 1; i < seq.length - 1; i++) {
            if (seq[i + 1] > seq[i - 1]) {
                seq[i] = seq[i + 1];
            } else if (seq[i - 1] > seq[i + 1]) {
                seq[i] = seq[i - 1];
            }
        }
        return seq;
    }

    // E
    public static void removeMiddleElement(int[] seq) {
        int middle = seq.length / 2;
        if (seq.length % 2 == 0) {
            for (int i = middle; i < seq.length - 1; i++) {
                seq[i - 1] = seq[i + 1];
            }
            seq[seq.length - 1] = 0;
            seq[seq.length - 2] = 0;
        } else if (seq.length % 2 == 1) {
            for (int i = middle; i < seq.length - 1; i++) {
                seq[i] = seq[i + 1];
            }
            seq[seq.length - 1] = 0;
        }
    }

    // F
    public static void moveEvenElements(int[] seq) {
        int swapPos = 0;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] % 2 == 0) {
                int temp = seq[swapPos];
                seq[swapPos] = seq[i];
                seq[i] = temp;
                swapPos += 1;
            }
        }
    }

    // G
    public static int secondLargestElement(int[] seq) {
        int largest = seq[0];
        int secondLargest = largest;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] > largest) {
                int temp = largest;
                largest = seq[i];
                secondLargest = temp;
            }
        }
        return secondLargest;
    }

    // H
    public static boolean isSorted(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++) {
            if (seq[i] > seq[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // I
    public static boolean hasAdjacentDuplicates(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++) {
            if (seq[i] == seq[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // J
    public static boolean hasDuplicateElements(int[] seq) {
        for (int i = 0; i < seq.length; i++) {
            for (int j = 0; j < seq.length; j++) {
                if (i != j && seq[i] == seq[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
