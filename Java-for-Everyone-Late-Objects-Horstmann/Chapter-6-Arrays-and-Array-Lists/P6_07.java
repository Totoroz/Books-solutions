/*Write a method that reverses the sequence of elements in an array. For example, if
you call the method with the array
    1  4  9  16  9  7  4  9  11
then the array is changed to
    11  9  4  7  9  16  9  4  1*/

public class P6_07 {
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
