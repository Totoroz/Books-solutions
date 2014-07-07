public class StringMergeSorter {
    public static void sort(String[] array) {
        if (array.length <= 1) {
            return;
        }
        String[] first = new String[array.length / 2];
        String[] second = new String[array.length - first.length];
        for (int i = 0; i < first.length; i++) {
            first[i] = array[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = array[first.length + i];
        }
        sort(first);
        sort(second);
        merge(first, second, array);
    }

    private static void merge(String[] first, String[] second, String[] array) {
        int nextFirstPos = 0;
        int nextSecondPos = 0;
        int nextMergedPos = 0;
        while (nextFirstPos < first.length && nextSecondPos < second.length) {
            if (first[nextFirstPos].compareTo(second[nextSecondPos]) < 0) {
                array[nextMergedPos] = first[nextFirstPos];
                nextFirstPos += 1;
            } else {
                array[nextMergedPos] = second[nextSecondPos];
                nextSecondPos += 1;
            }
            nextMergedPos += 1;
        }
        while (nextFirstPos < first.length) {
            array[nextMergedPos] = first[nextFirstPos];
            nextMergedPos += 1;
            nextFirstPos += 1;
        }
        while (nextSecondPos < second.length) {
            array[nextMergedPos] = second[nextSecondPos];
            nextMergedPos += 1;
            nextSecondPos += 1;
        }
    }
}
