public class MergeSorter {
    public static void sort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int[] first = new int[array.length / 2];
        int[] second = new int[array.length - first.length];

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

    private static void merge(int[] first, int[] second, int[] array) {
        int nextFirst = 0;
        int nextSecond = 0;
        int nextArray = 0;
        while (nextFirst < first.length && nextSecond < second.length) {
            if (first[nextFirst] < second[nextSecond]) {
                array[nextArray] = first[nextFirst];
                nextFirst += 1;
            } else {
                array[nextArray] = second[nextSecond];
                nextSecond += 1;
            }
            nextArray += 1;
        }
        while (nextFirst < first.length) {
            array[nextArray] = first[nextFirst];
            nextFirst += 1;
            nextArray += 1;
        }
        while (nextSecond < second.length) {
            array[nextArray] = second[nextSecond];
            nextSecond += 1;
            nextArray += 1;
        }
    }
}
