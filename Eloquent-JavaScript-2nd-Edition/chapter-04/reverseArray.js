'use strict';


function reverseArray(array) {
    for (var i = 0; i < Math.floor(array.length / 2); i++) {
        var old = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = old;
    }
    return array;
}

console.log(reverseArray(['A', 'B', 'C']));
console.log(reverseArray([5, 4, 3, 2, 1]));
