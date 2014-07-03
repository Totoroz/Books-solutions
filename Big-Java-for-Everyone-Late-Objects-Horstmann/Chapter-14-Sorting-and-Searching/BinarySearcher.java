
public class BinarySearcher {
    public int search(int[] array, int low, int high, int needle) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == needle) {
                return mid;
            } else if (array[mid] < needle) {
                return this.search(array, mid + 1, high, needle);
            } else {
                return this.search(array, low, mid - 1, needle);
            }
        }
        return -1;
    }
}
