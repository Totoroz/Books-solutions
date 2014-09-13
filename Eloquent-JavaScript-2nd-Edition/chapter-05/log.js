'use strict';


function logEach(arr) {
    arr.forEach(function (item) {
        console.log(item);
    });
}

console.log(logEach([5, 4, 3, 2, 1]));
console.log(logEach(['A', 'B', 'C']));
