

public class BinarySearcher {
    public static int search(int[] array, int low, int high, int needle) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == needle) {
                return mid;
            } else if (array[mid] < needle) {
                return search(array, mid + 1, high, needle);
            } else {
                return search(array, low, mid - 1, needle);
            }
        }
        return -1;
    }

    // JDK-like implementation
    public static int binarySearch(int[] array, int low, int high, int needle) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == needle) {
                return mid;
            } else if (array[mid] < needle) {
                return binarySearch(array, mid + 1, high, needle);
            } else {
                return binarySearch(array, low, mid - 1, needle);
            }
        }
        // If needle can't be found and it should be inserted as position 0,
        // it should show -1.
        return -(low + 1);
    }

    public static int binarySearch(int[] array, int needle) {
        return binarySearch(array, 0, array.length - 1, needle);
    }
}
