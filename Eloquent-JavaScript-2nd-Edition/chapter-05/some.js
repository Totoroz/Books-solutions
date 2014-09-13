'use strict';


function some(array, predicate) {
    var bool = false;
    array.forEach(function (item) {
        if (predicate(item)) {
            bool = true;
        }
    });
    return bool;
}

console.log(some([NaN, 3, 4], isNaN));
console.log(some([2, 3, 4], isNaN));
