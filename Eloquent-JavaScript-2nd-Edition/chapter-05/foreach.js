'use strict';


function forEach(array, action) {
    for (var i = 0; i < array.length; i++) {
        action(array[i]);
    }
}

console.log(forEach([5,4,3,2,1], console.log));
console.log(forEach(['A', 'B', 'C'], console.log));
